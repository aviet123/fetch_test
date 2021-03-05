package com.example.demo.controller;

import com.example.demo.model.Cloud;
import com.example.demo.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("city/weather")
public class CloudController {
    @Autowired
    CloudService cloudService;

    @PostMapping("/cloud")
    public Cloud saveCloudCityWeather(@RequestBody Cloud cloud){
        return cloudService.save(cloud);
    }

    @DeleteMapping("/cloud/{id}")
    public void removeCloudWeatherRecord(@PathVariable Integer id){
        cloudService.remove(id);
    }

    @PutMapping("/cloud/{id}")
    public Cloud updateCloudCityWeather(@PathVariable Integer id, @RequestBody Cloud cloud){
        return cloudService.update(id,cloud);
    }
}
