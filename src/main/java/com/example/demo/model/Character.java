package com.example.demo.model;

import com.example.demo.model.attributes.Charisma;
import com.example.demo.model.attributes.Constitution;
import com.example.demo.model.attributes.Dexterity;
import com.example.demo.model.attributes.Intelligence;
import com.example.demo.model.attributes.Strength;
import com.example.demo.model.attributes.Wisdom;
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
