package com.example.demo.controller;

import com.example.demo.model.Character;
import com.example.demo.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class CharacterController {

    CharacterService characterService;

    CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping(path = "createCharacter")
    public Character createCharacter(@RequestBody Character character) {
        return characterService.createCharacter(character);
    }

    @GetMapping(path = "getCharacter/{id}")
    public Character getCharacter(@PathVariable Integer id) {
        return characterService.getCharacter(id);
    }


//    @PatchMapping(path = "character/{id}")
//    public Character editCharacter(@RequestBody Character character, @PathVariable("id") Integer id) {
//
//    }

}
