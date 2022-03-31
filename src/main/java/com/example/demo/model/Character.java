package com.example.demo.model;

import com.example.demo.model.attributes.*;
import lombok.Data;

@Data
public class Character {

    private Integer id;

    private String name;

    private Strength strength;

    private Dexterity dexterity;

    private Constitution constitution;

    private Wisdom wisdom;

    private Intelligence intelligence;

    private Charisma charisma;

}
