package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "sys")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemInfo {

    private Integer type;

    @Id
    private Integer id;

    private String message;

    private String country;

    private Long sunrise;

    private Long sunset;

}
