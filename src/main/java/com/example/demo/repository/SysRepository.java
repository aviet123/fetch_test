package com.example.demo.repository;

import com.example.demo.model.SystemInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysRepository extends JpaRepository<SystemInfo, Integer> {
}
