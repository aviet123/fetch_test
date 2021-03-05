package com.example.demo.controller;

import com.example.demo.model.Coordinate;
import com.example.demo.model.MainInfo;
import com.example.demo.service.MainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("city/weather")
public class MainInfoController {

    @Autowired
    MainInfoService mainInfoService;

    @PostMapping("/main")
    public MainInfo saveMainInfoCityWeather(@RequestBody MainInfo mainInfo){
        return mainInfoService.save(mainInfo);
    }

    @DeleteMapping("/main/{id}")
    public void removeMainInfoWeatherRecord(@PathVariable Integer id){
        mainInfoService.remove(id);
    }

    @PutMapping("/main/{id}")
    public MainInfo updateMainInfoCityWeather(@PathVariable Integer id, @RequestBody MainInfo mainInfo){
        return mainInfoService.update(id,mainInfo);
    }
}
