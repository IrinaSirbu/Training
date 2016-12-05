package com.example.repository;

import com.example.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by isirbu on 11/23/2016.
 */

@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity, Integer>{

    WeatherEntity findByName(String name);
}
