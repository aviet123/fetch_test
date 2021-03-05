package com.example.demo.repository;

import com.example.demo.model.CityWeather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityWeatherRepository extends JpaRepository<CityWeather,Integer> {
    CityWeather findCityWeatherByName(String name);
}
