package com.example.service;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by isirbu on 11/23/2016.
 */
public class WeatherTest {
    @Test
    public void getWeatherDTO() throws Exception {

    }

    @Test
    public void setWeatherDTO() throws Exception {

    }

    @Test
    public void getWeather() throws Exception {
        Weather a = new Weather();
        a.getWeather("Bucuresti");
    }

}