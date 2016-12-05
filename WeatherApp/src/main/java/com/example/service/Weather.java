package com.example.service;

import com.example.model.WeatherEntity;
import com.example.repository.WeatherRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.IOException;

/**
 * Created by isirbu on 11/21/2016.
 */

@org.springframework.stereotype.Service
public class Weather {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private WeatherRepository weatherRepository;

    private static final String URL = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static final String API_KEY = ",ro&appid=e6b04b52c6ed5501ac7f6b91df0d66ba";

    private String setURL(String city){

        return URL + city + API_KEY;
    }

    @Transactional(readOnly = true)
    private WeatherEntity getWeatherEntity(String name){

        WeatherEntity weatherEntity = weatherRepository.findByName(name);
        if(weatherEntity != null){
            return weatherEntity;
        } else {
            return null;
        }
    }

    @Transactional
    private WeatherEntity saveWeather(String name){

        WeatherEntity weatherEntity = getWeatherAPI(name);
        weatherRepository.save(weatherEntity);
        return  weatherEntity;
    }

    @Transactional
    private void deleteWeather(String name){

        WeatherEntity weatherEntity = getWeatherEntity(name);
        weatherRepository.delete(weatherEntity.getId());
    }


    private WeatherEntity getWeatherAPI(String name){

        String url = setURL(name);

        try {
            HttpResponse<JsonNode> j = Unirest.get(url)
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                    .asJson();

            System.out.println(j.getBody().toString());
            WeatherEntity w = mapper.readValue(j.getBody().toString(), WeatherEntity.class).getMain();
            w.setName(name);
            w.setDate(DateTime.now().toString());

            return w;
        } catch (UnirestException e) {
            System.out.println("UnirestException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        return null;
    }


    public WeatherEntity getWeather(String city){

        if(getWeatherEntity(city) != null) {

            WeatherEntity w = getWeatherEntity(city);
            DateTime date = DateTime.parse(w.getDate());

            if (date.getDayOfMonth() == DateTime.now().getDayOfMonth()){
                return w;
            } else {
                deleteWeather(city);
                return saveWeather(city);
            }
        } else {
            return saveWeather(city);
        }
    }
}