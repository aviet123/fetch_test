package com.example.demo.service.impl;

import com.example.demo.model.Cloud;
import com.example.demo.model.Snow;
import com.example.demo.repository.CloudRepository;
import com.example.demo.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CloudServiceImpl implements CloudService {

    @Autowired
    CloudRepository cloudRepository;


    @Override
    public List<Cloud> findAll() {
        return null;
    }

    @Override
    public Optional<Cloud> findById(Integer id) {
        return cloudRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        if (findById(id).isPresent())
        cloudRepository.deleteById(id);
    }

    @Override
    public Cloud save(Cloud cloud) {
        return cloudRepository.save(cloud);
    }

    @Override
    public Cloud update(Integer id, Cloud cloud) {
        Optional<Cloud> oldCloud = findById(id);
        if (oldCloud.isPresent()){
            oldCloud.get().setAll(cloud.getAll());
            return cloudRepository.save(oldCloud.get());
        }
        return null;
    }
}
