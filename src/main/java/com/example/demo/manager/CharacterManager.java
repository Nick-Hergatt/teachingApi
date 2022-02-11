package com.example.demo.manager;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.mapper.CharacterMapper;
import com.example.demo.model.Character;
import com.example.demo.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CharacterManager {

    CharacterMapper characterMapper;
    CharacterRepository characterRepo;

    @Autowired
    CharacterManager(CharacterMapper characterMapper, CharacterRepository characterRepo) {
        this.characterMapper = characterMapper;
        this.characterRepo = characterRepo;
    }

    public Character createCharacter(Character character) {
        CharacterEntity entity = characterMapper.modelToEntity(character);
        entity = characterRepo.save(entity);
        return characterMapper.entityToModel(entity);
    }
}
