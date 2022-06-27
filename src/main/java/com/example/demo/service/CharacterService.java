package com.example.demo.service;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.mapper.CharacterMapper;
import com.example.demo.model.Character;
import com.example.demo.repository.CharacterRepository;
import lombok.val;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CharacterService {

    CharacterMapper characterMapper;
    CharacterRepository characterRepo;

    public CharacterService(CharacterMapper characterMapper, CharacterRepository characterRepo) {
        this.characterMapper = characterMapper;
        this.characterRepo = characterRepo;
    }

    public Character createCharacter(Character character) {
        CharacterEntity entity = characterMapper.modelToEntity(character);

        entity = characterRepo.save(entity);
        return characterMapper.entityToModel(entity);
    }

    public Character getCharacter(Integer id) {
        val optional = characterRepo.findById(id);
        val entity = optional.orElse(null);
        return characterMapper.entityToModel(entity);
    }
}
