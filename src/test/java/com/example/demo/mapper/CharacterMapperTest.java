package com.example.demo.mapper;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.model.Character;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterMapperTest {
    CharacterMapper characterMapper = new CharacterMapper();

    CharacterEntity expectedEntity;
    Character expectedModel;

    @BeforeEach
    void setUp() {
        expectedEntity = new CharacterEntity();
        expectedEntity.setName("Nick");

        expectedModel = new Character();
        expectedModel.setName("Nick");
    }

    @Test
    void entityToModelTest() {
        Character actual = characterMapper.entityToModel(expectedEntity);
        assertEquals(expectedModel, actual);
    }

}
