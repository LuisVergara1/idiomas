package com.idiomas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Hiragana {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String hiragana;
    String romanji;
    
}
