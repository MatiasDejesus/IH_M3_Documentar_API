package com.yugioh.Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yugioh.Entity.Personaje;
import com.yugioh.Services.personajeServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/Personaje")
@CrossOrigin(origins = "*")

@Tag(name = "Personajes", description = "Busca personajes de YuGioh que se encuentren en la base de datos")
public class personajeController {

    @Autowired
    public personajeServices personajeServices;

    @GetMapping("/{id}")
    @Operation(summary = "Obtener personaje por ID", description = "Devuelve un personaje de la base de datos según su ID")
    public ResponseEntity<Personaje> obtenerPersonajePorId(@PathVariable Long id) {
        Optional<Personaje> personaje = personajeServices.buscarPersonajePorId(id);
        
        if (personaje.isPresent()) {
            return ResponseEntity.ok(personaje.get());
        } else {
            return ResponseEntity.notFound().build(); 
        }
    }


    @GetMapping
    @Operation(summary = "Permite mostrar todos los personajes", description = "Devuelve todos los personajes")
    public List<Personaje> obtenerTodosLosPersonajes() {
        return personajeServices.obtenerTodosLosPersonajes();
    }


    @PostMapping
    @Operation(summary = "Permite añadir un nuevo personaje", description = "Añadir un personaje a la base de datos")
    public Personaje crearPersonaje(@RequestBody Personaje personaje) {
        return personajeServices.savePersonaje(personaje);
    }


    
}
