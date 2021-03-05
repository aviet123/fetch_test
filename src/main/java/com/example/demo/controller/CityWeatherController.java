package com.example.demo.controller;

import com.example.demo.model.CityWeather;
import com.example.demo.model.Cloud;
import com.example.demo.model.MainInfo;
import com.example.demo.model.Wind;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("city/weather")
public class CityWeatherController {

    @Autowired
    CityService cityService;

    @Autowired
    CoordinateService coordinateService;
    @Autowired
    MainInfoService mainInfoService;
    @Autowired
    RainService rainService;
    @Autowired
    SnowService snowService;
    @Autowired
    SysService sysService;
    @Autowired
    WeatherService weatherService;
    @Autowired
    WindService windService;


    @PostMapping("")
    public CityWeather saveCityWeather(@RequestBody CityWeather cityWeather){
        return cityService.save(cityWeather);
    }

    @DeleteMapping("/{id}")
    public void removeWeatherRecord(@PathVariable Integer id){
        cityService.remove(id);
    }

    @PutMapping("{id}")
    public CityWeather updateCityWeather(@PathVariable Integer id, @RequestBody CityWeather newCityWeather){
       return cityService.update(id,newCityWeather);
    }






}
