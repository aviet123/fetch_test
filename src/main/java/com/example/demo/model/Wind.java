package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Wind {

    @Id
    private Integer id;

    private Float speed;

    private Integer deg;

    private Double gust;
}
