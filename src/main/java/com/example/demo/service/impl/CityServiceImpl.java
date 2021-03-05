package com.example.demo.service.impl;

import com.example.demo.model.CityWeather;
import com.example.demo.model.Snow;
import com.example.demo.repository.CityWeatherRepository;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityWeatherRepository cityWeatherRepository;


    @Override
    public List<CityWeather> findAll() {
        return cityWeatherRepository.findAll();
    }

    @Override
    public Optional<CityWeather> findById(Integer id) {
        return cityWeatherRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        if (findById(id).isPresent())
            cityWeatherRepository.deleteById(id);
    }

    @Override
    public CityWeather save(CityWeather cityWeather) {
        return cityWeatherRepository.save(cityWeather);
    }

    @Override
    public CityWeather update(Integer id, CityWeather cityWeather) {
        Optional<CityWeather> oldCityWeatherInfo = findById(id);
        if (oldCityWeatherInfo.isPresent()){
            oldCityWeatherInfo.get().setBase(cityWeather.getBase());
            oldCityWeatherInfo.get().setDt(cityWeather.getDt());
            oldCityWeatherInfo.get().setName(cityWeather.getName());
            oldCityWeatherInfo.get().setVisibility(cityWeather.getVisibility());
            oldCityWeatherInfo.get().setCod(cityWeather.getCod());
            return cityWeatherRepository.save(oldCityWeatherInfo.get());
        }
        return null;
    }
}
