package com.example.demo.controller;


import com.example.demo.model.Cloud;
import com.example.demo.model.Coordinate;
import com.example.demo.service.CloudService;
import com.example.demo.service.CoordinateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("city/weather")
public class CoordinateController {
    @Autowired
    CoordinateService coordinateService;

    @PostMapping("/coord")
    public Coordinate saveCoordinateCityWeather(@RequestBody Coordinate coordinate){
        return coordinateService.save(coordinate);
    }

    @DeleteMapping("/coord/{id}")
    public void removeCoordinateWeatherRecord(@PathVariable Integer id){
        coordinateService.remove(id);
    }

    @PutMapping("/coord/{id}")
    public Coordinate updateCoordinateCityWeather(@PathVariable Integer id, @RequestBody Coordinate coordinate){
        return coordinateService.update(id,coordinate);
    }
}
