package com.example.demo.controller;

import com.example.demo.manager.CharacterManager;
import com.example.demo.model.Character;
import com.example.demo.model.Charisma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class CharacterController {

    CharacterManager characterManager;

    @Autowired
    CharacterController(CharacterManager characterManager) {
        this.characterManager = characterManager;
    }

    @PostMapping(path = "createCharacter")
    public Character createCharacter(@RequestBody Character character) {
        return characterManager.createCharacter(character);
    }

}
