package com.idiomas.service.hiragana;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idiomas.entity.Hiragana;
import com.idiomas.repository.HiraganaRepository;

@Service
public class HiraganaServiceImpl implements HiraganaService {

    @Autowired
    private HiraganaRepository hiraganaRepository;

    @Override
    public Hiragana save(Hiragana hiragana) {

       return hiraganaRepository.save(hiragana);     
    }

    @Override
    public Hiragana find(Long id) {
        return hiraganaRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean delele(Long id) {
        //Falta Implementar
        return true;
    }

    @Override
    public List<Hiragana> findAll() {
        return hiraganaRepository.findAll();    
    }
    
}
