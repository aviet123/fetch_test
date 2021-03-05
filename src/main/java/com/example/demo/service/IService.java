package com.example.demo.service;

import java.util.List;
import java.util.Optional;

public interface IService<V,K> {
    List<V> findAll();
    Optional<V> findById(K id);
    void remove(K id);
    V save (V v);
    V update(K id, V v);
}
