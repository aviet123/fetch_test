package com.example.demo.controller;

import com.example.demo.model.Snow;
import com.example.demo.service.SnowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("city/weather")
public class SnowController {

    @Autowired
    SnowService snowService;

    @PostMapping("/snow")
    public Snow saveSnow(@RequestBody Snow snow){
        return snowService.save(snow);
    }

    @DeleteMapping("/snow/{id}")
    public void removeSnowRecord(@PathVariable Integer id){
        snowService.remove(id);
    }

    @PutMapping("/snow/{id}")
    public Snow updateSnow(@PathVariable Integer id, @RequestBody Snow snow){
        return snowService.update(id,snow);
    }
}
