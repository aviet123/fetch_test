package com.example.demo.service.impl;

import com.example.demo.model.SystemInfo;
import com.example.demo.model.Wind;
import com.example.demo.repository.SysRepository;
import com.example.demo.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SysServiceImpl implements SysService {

    @Autowired
    SysRepository sysRepository;

    @Override
    public List<SystemInfo> findAll() {
        return null;
    }

    @Override
    public Optional<SystemInfo> findById(Integer id) {
        return sysRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        if (findById(id).isPresent())
            sysRepository.deleteById(id);
    }

    @Override
    public SystemInfo save(SystemInfo sys) {
        return sysRepository.save(sys);
    }

    @Override
    public SystemInfo update(Integer id, SystemInfo systemInfo) {
        Optional<SystemInfo> oldSystem = findById(id);
        if (oldSystem.isPresent()){
            oldSystem.get().setMessage(systemInfo.getMessage());
            oldSystem.get().setCountry(systemInfo.getCountry());
            oldSystem.get().setType(systemInfo.getType());
            oldSystem.get().setSunrise(systemInfo.getSunrise());
            oldSystem.get().setSunset(systemInfo.getSunset());
            return sysRepository.save(oldSystem.get());
        }
        return null;
    }
}
