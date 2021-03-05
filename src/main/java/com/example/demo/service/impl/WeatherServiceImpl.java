package com.example.demo.service.impl;

import com.example.demo.model.Weather;
import com.example.demo.model.Wind;
import com.example.demo.repository.WeatherRepository;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    WeatherRepository weatherRepository;


    @Override
    public List<Weather> findAll() {
        return null;
    }

    @Override
    public Optional<Weather> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void remove(Integer id) {
        if (findById(id).isPresent())
            weatherRepository.deleteById(id);
    }


    @Override
    public Weather save(Weather weather) {
        return weatherRepository.save(weather);
    }

    @Override
    public Weather update(Integer id, Weather weather) {
        Optional<Weather> oldWeather = findById(id);
        if (oldWeather.isPresent()){
            oldWeather.get().setDescription(weather.getDescription());
            oldWeather.get().setIcon(weather.getIcon());
            oldWeather.get().setMain(weather.getMain());
            return weatherRepository.save(oldWeather.get());
        }
        return null;
    }
}
