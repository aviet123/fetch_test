package com.example.demo.service.impl;

import com.example.demo.model.MainInfo;
import com.example.demo.model.Snow;
import com.example.demo.repository.MainInfoRepository;
import com.example.demo.service.MainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainInfoServiceImpl implements MainInfoService {

    @Autowired
    MainInfoRepository mainInfoRepository;

    @Override
    public List<MainInfo> findAll() {
        return null;
    }

    @Override
    public Optional<MainInfo> findById(Integer id) {
        return mainInfoRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        if (findById(id).isPresent())
        mainInfoRepository.deleteById(id);
    }

    @Override
    public MainInfo save(MainInfo mainInfo) {
        return mainInfoRepository.save(mainInfo);
    }

    @Override
    public MainInfo update(Integer id, MainInfo mainInfo) {
        Optional<MainInfo> oldMain = findById(id);
        if (oldMain.isPresent()){
            oldMain.get().setTemp(mainInfo.getTemp());
            oldMain.get().setTemp_max(mainInfo.getTemp_max());
            oldMain.get().setTemp_min(mainInfo.getTemp_min());
            oldMain.get().setFeels_like(mainInfo.getFeels_like());
            oldMain.get().setHumidity(mainInfo.getHumidity());
            oldMain.get().setPressure(mainInfo.getPressure());
            oldMain.get().setSea_level(mainInfo.getSea_level());
            oldMain.get().setGrnd_level(mainInfo.getGrnd_level());
            return mainInfoRepository.save(oldMain.get());
        }
        return null;
    }
}
