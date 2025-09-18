package com.yugioh.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yugioh.Entity.Personaje;
import com.yugioh.Repository.personajeRepository;

@Service
public class personajeServices {

    @Autowired
    private personajeRepository personajeRepository;
        
    public Optional<Personaje> buscarPersonajePorId(Long idpersonaje) {
        return personajeRepository.findById(idpersonaje);
    }


    public List<Personaje> obtenerTodosLosPersonajes() {
        return personajeRepository.findAll(); // Usa el método heredado
    }



     // ¡Este método es suficiente!
    public Personaje savePersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }
    
    
}
