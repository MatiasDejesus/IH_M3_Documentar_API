package com.yugioh.Controllers;

import com.yugioh.Entity.Carta;
import com.yugioh.Services.cartaServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/cartas") // ← Todas las URLs empezarán con /cartas
@CrossOrigin(origins = "*") // ← AÑADE ESTA LÍNEA JUSTO AQUÍ

@Tag(name = "Cartas", description = "Operaciones cartas de YUGIOH")
public class cartaController {
    @Autowired
    private cartaServices cartaService;

    // GET /cartas/{id} - Obtener carta por ID

    @GetMapping("/{id}")
    @Operation(summary = "Obtener carta por ID", description = "Devuelve una carta según su ID")
    public ResponseEntity<Carta> obtenerCartaPorId(@PathVariable Long id) {
        Optional<Carta> carta = cartaService.buscarCartaPorId(id);
        
        if (carta.isPresent()) {
            return ResponseEntity.ok(carta.get()); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }


}