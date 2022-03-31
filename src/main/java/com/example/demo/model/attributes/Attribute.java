package com.example.demo.model.attributes;

import lombok.Data;

import java.util.Objects;

@Data
public abstract class Attribute {

    private Integer value;

    private Integer modifier;

}
