package com.idiomas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.idiomas.entity.Hiragana;

@Repository
public interface HiraganaRepository extends JpaRepository <Hiragana , Long> {

    @Query(value = "SELECT * FROM hiragana ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Hiragana randomHiragana();
}
