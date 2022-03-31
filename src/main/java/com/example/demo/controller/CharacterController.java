package com.example.demo.controller;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.manager.CharacterManager;
import com.example.demo.mapper.CharacterMapper;
import com.example.demo.model.Character;
import com.example.demo.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
@RequestMapping(path = "/")
public class CharacterController {

    CharacterManager characterManager;

    CharacterController(CharacterManager characterManager) {
        this.characterManager = characterManager;
    }

    @PostMapping(path = "createCharacter")
    public Character createCharacter(@RequestBody Character character) {
        return characterManager.createCharacter(character);
    }

//    @PatchMapping(path = "character/{id}")
//    public Character editCharacter(@RequestBody Character character, @PathVariable("id") Integer id) {
//
//    }

}
