package com.example.demo.repository;

import com.example.demo.model.MainInfo;
import com.example.demo.model.Rain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RainRepository extends JpaRepository<Rain, Integer> {
}
