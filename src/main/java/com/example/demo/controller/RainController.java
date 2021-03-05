package com.example.demo.controller;

import com.example.demo.model.Rain;
import com.example.demo.service.RainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("city/weather")
public class RainController {

    @Autowired
    RainService rainService;

    @PostMapping("/rain")
    public Rain saveRainInfoCityWeather(@RequestBody Rain rain){
        return rainService.save(rain);
    }

    @DeleteMapping("/rain/{id}")
    public void removeRainInfoWeatherRecord(@PathVariable Integer id){
        rainService.remove(id);
    }

    @PutMapping("/rain/{id}")
    public Rain updateRainInfoCityWeather(@PathVariable Integer id, @RequestBody Rain rain){
        return rainService.update(id,rain);
    }

}
