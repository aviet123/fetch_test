package com.example.demo.service.impl;

import com.example.demo.model.Coordinate;
import com.example.demo.model.Snow;
import com.example.demo.repository.CloudRepository;
import com.example.demo.repository.CoordinateRepository;
import com.example.demo.service.CoordinateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoordServiceImpl implements CoordinateService {

    @Autowired
    CoordinateRepository coordinateRepository;

    @Override
    public List<Coordinate> findAll() {
        return null;
    }

    @Override
    public Optional<Coordinate> findById(Integer id) {
        return coordinateRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        if (findById(id).isPresent())
        coordinateRepository.deleteById(id);
    }

    @Override
    public Coordinate save(Coordinate coordinate) {
        return coordinateRepository.save(coordinate);
    }

    @Override
    public Coordinate update(Integer id, Coordinate coordinate) {
        Optional<Coordinate> oldCoord = findById(id);
        if (oldCoord.isPresent()){
            oldCoord.get().setLat(coordinate.getLat());
            oldCoord.get().setLon(coordinate.getLon());
            return coordinateRepository.save(oldCoord.get());
        }
        return null;
    }
}
