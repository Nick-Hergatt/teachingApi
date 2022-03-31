package com.example.demo.repository;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {
}
