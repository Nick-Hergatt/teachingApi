package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character")
public class CharacterEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

}
