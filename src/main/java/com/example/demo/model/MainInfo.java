package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "main")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MainInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Double temp;


    @JsonProperty("feels_like")
    private Double feelsLike;

    @JsonProperty("temp_min")
    private Double tempMin;

    @JsonProperty("temp_max")
    private Double tempMax;
    private Integer pressure;
    private Integer humidity;
    @JsonProperty("sea_level")
    private Integer seaLevel;

    @JsonProperty("grnd_level")
    private Integer groundLevel;
}
