package com.example.demo.controller;

import com.example.demo.model.MainInfo;
import com.example.demo.model.Wind;
import com.example.demo.service.MainInfoService;
import com.example.demo.service.WindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("city/weather")
public class WindController {

    @Autowired
    WindService windService;

    @PostMapping("/wind")
    public Wind saveWindCityWeather(@RequestBody Wind wind){
        return windService.save(wind);
    }

    @DeleteMapping("/wind/{id}")
    public void removeWindWeatherRecord(@PathVariable Integer id){
        windService.remove(id);
    }

    @PutMapping("/wind/{id}")
    public Wind updateWindCityWeather(@PathVariable Integer id, @RequestBody Wind wind){
        return windService.update(id,wind);
    }
}
