package com.example.demo.mapper;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.model.Character;
import lombok.val;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class CharacterMapper {

    public CharacterEntity modelToEntity(Character character) {
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setName(character.getName());
        characterEntity.setId(character.getId());
        return characterEntity;
    }

    public Character entityToModel(CharacterEntity characterEntity) {
        val name = Objects.nonNull(characterEntity) ? characterEntity.getName() : null;
        val id = Objects.nonNull(characterEntity) ? characterEntity.getId() : null;
        val character = new Character();
        character.setName(name);
        character.setId(id);
        return character;
    }
    public List<Character> entityListToModelList(List<CharacterEntity> characterEntityList) {
        return characterEntityList.stream().map(characterEntity -> entityToModel(characterEntity)).collect(Collectors.toList());
    }

}
