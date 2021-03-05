package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Coordinate {

    @Id
    private Long id;
    private Double lon;
    private Double lat;
}
