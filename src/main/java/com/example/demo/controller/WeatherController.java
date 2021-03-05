package com.example.demo.controller;

import com.example.demo.model.Weather;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("city/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @PostMapping("/info")
    public Weather saveWeather(@RequestBody Weather weather){
        return weatherService.save(weather);
    }

    @DeleteMapping("/info/{id}")
    public void removeWeather(@PathVariable Integer id){
        weatherService.remove(id);
    }

    @PutMapping("/info/{id}")
    public Weather updateWeather(@PathVariable Integer id, @RequestBody Weather weather){
        return weatherService.update(id,weather);
    }
}
