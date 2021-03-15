package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Snow {

    @Id
    private Integer id;

    @JsonProperty("1h")
    private Double volume1h;

    @JsonProperty("3h")
    private Double volume3h;
}
