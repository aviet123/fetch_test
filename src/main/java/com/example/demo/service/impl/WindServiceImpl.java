package com.example.demo.service.impl;

import com.example.demo.model.Wind;
import com.example.demo.repository.WindRepository;
import com.example.demo.service.WindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WindServiceImpl implements WindService {

    @Autowired
    WindRepository windRepository;

    @Override
    public List<Wind> findAll() {
        return windRepository.findAll();
    }

    @Override
    public Optional<Wind> findById(Integer id) {
        return windRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        if (findById(id).isPresent())
            windRepository.deleteById(id);
    }

    @Override
    public Wind save(Wind wind) {
        return windRepository.save(wind);
    }

    @Override
    public Wind update(Integer id, Wind wind) {
        Optional<Wind> oldWind = findById(id);
        if (oldWind.isPresent()){
            oldWind.get().setSpeed(wind.getSpeed());
            oldWind.get().setDeg(wind.getDeg());
            oldWind.get().setGust(wind.getGust());
            return windRepository.save(oldWind.get());
        }
        return null;
    }
}
