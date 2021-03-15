package com.example.demo.service.impl;

import com.example.demo.model.Snow;
import com.example.demo.model.Wind;
import com.example.demo.repository.SnowRepository;
import com.example.demo.service.SnowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SnowServiceImpl implements SnowService {

    @Autowired
    SnowRepository snowRepository;

    @Override
    public List<Snow> findAll() {
        return null;
    }

    @Override
    public Optional<Snow> findById(Integer id) {
        return snowRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
       if (findById(id).isPresent()){
           snowRepository.deleteById(id);
       }
    }

    @Override
    public Snow save(Snow snow) {
        return snowRepository.save(snow);
    }

    @Override
    public Snow update(Integer id, Snow snow) {
        Optional<Snow> oldSnow = findById(id);
        if (oldSnow.isPresent()){
            oldSnow.get().setVolume1h(snow.getVolume1h());
            oldSnow.get().setVolume3h(snow.getVolume3h());
            return snowRepository.save(oldSnow.get());
        }
        return null;
    }
}
