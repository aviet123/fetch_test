package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.TimeZone;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CityWeather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Coordinate coord;

    @OneToMany
    private List<Weather> weather;

    private String base;

    @OneToOne
    private MainInfo main;

    private Integer visibility;

    @OneToOne
    private Wind wind;

    @OneToOne
    private Cloud clouds;

    @OneToOne
    private Rain rain;

    @OneToOne
    private Snow snow;

    private Long dt;

    @OneToOne
    private SystemInfo sys;

    private TimeZone timezone;

    private String name;

    private Integer cod;

    private LocalDate date = LocalDate.now();
}
