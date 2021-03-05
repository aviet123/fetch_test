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
public class Rain {
    @Id
    private Integer id;

    @JsonProperty("1h")
    private Double _1h;

    @JsonProperty("3h")
    private Double _3h;
}

