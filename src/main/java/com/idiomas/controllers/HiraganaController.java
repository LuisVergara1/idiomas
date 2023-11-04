package com.idiomas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idiomas.entity.Hiragana;
import com.idiomas.repository.HiraganaRepository;
import com.idiomas.service.hiragana.HiraganaServiceImpl;


@RestController
@RequestMapping("/hiragana")
public class HiraganaController {

    private final HiraganaServiceImpl hiraganaService;
    private final HiraganaRepository hiraganaRepository;

    @Autowired
    public HiraganaController(HiraganaServiceImpl hiraganaService, HiraganaRepository hiraganaRepository) {
        this.hiraganaService = hiraganaService;
        this.hiraganaRepository = hiraganaRepository;
    }


    @GetMapping("/aleatorio")
    public ResponseEntity<Hiragana> aleatorio()
    {
        Hiragana encontrado = hiraganaRepository.randomHiragana();
        return  ResponseEntity.ok(encontrado);
    }
    
}
