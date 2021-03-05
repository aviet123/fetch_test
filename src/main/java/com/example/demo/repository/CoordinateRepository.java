package com.example.demo.repository;

import com.example.demo.model.Coordinate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinateRepository extends JpaRepository<Coordinate, Integer> {
}
