package com.example.demo.mapper;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.model.Character;
import org.springframework.stereotype.Component;

@Component
public class CharacterMapper {

    public CharacterEntity modelToEntity(Character character) {
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setName(character.getName());
        characterEntity.setId(character.getId());
        return characterEntity;
    }

    public Character entityToModel(CharacterEntity characterEntity) {
        Character character = new Character();
        character.setName(characterEntity.getName());
        character.setId(characterEntity.getId());
        return character;
    }

}
