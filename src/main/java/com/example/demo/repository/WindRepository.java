package com.example.demo.repository;

import com.example.demo.model.MainInfo;
import com.example.demo.model.Wind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindRepository extends JpaRepository<Wind, Integer> {
}
