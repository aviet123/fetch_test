package com.example.demo.service.impl;

import com.example.demo.model.Rain;
import com.example.demo.model.Snow;
import com.example.demo.repository.RainRepository;
import com.example.demo.service.RainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RainServiceImpl implements RainService {

    @Autowired
    RainRepository rainRepository;


    @Override
    public List<Rain> findAll() {
        return null;
    }

    @Override
    public Optional<Rain> findById(Integer id) {
        return rainRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        if (findById(id).isPresent())
        rainRepository.deleteById(id);
    }

    @Override
    public Rain save(Rain rain) {
        return rainRepository.save(rain);
    }

    @Override
    public Rain update(Integer id, Rain rain) {
        Optional<Rain> oldRain = findById(id);
        if (oldRain.isPresent()){
            oldRain.get().set_1h(rain.get_1h());
            oldRain.get().set_3h(rain.get_3h());
            return rainRepository.save(oldRain.get());
        }
        return null;
    }
}
