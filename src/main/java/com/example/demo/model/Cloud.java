package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cloud {

    @Id
    private Integer id;
    private String all;
}
