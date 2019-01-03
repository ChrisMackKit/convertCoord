package com.example.demo.domain.modal;

import javax.persistence.Entity;

import lombok.Getter;

@Entity
public class Test {

    @Getter
    private int id;

    private String name;

    private String description;

}
