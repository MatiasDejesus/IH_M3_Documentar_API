package com.yugioh.Services;


import com.yugioh.Entity.Carta;
import com.yugioh.Repository.cartaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class cartaServices {
    
    @Autowired
    private cartaRepository cartaRepository;


    // 📌 Buscar carta por ID
    public Optional<Carta> buscarCartaPorId(Long id) {
        return cartaRepository.findById(id);
    }

   

}