package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Weather {

    @Id
    private Integer id;

    private String main;

    private String description;

    private String icon;
}
