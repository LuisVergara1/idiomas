package com.idiomas.service.hiragana;

import java.util.List;

import com.idiomas.entity.Hiragana;

public interface HiraganaService {
    
    Hiragana save( Hiragana hiragana);

    Hiragana find(Long id);

    Boolean delele(Long id);

    List<Hiragana> findAll();

}
