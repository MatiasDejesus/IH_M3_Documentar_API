package com.yugioh.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Cartas")

public class Carta{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarta;

    private String nombreCarta;
    private String tipoCarta;
    private Integer ataqueCarta;
    private Integer defensaCarta;
    private String imagenUrl;

}
