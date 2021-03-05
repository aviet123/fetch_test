package com.example.demo.repository;

import com.example.demo.model.MainInfo;
import com.example.demo.model.Snow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnowRepository extends JpaRepository<Snow, Integer> {
}
