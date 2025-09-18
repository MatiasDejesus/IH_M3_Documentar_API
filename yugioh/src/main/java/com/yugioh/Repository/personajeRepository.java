package com.yugioh.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yugioh.Entity.Personaje;



@Repository
public interface personajeRepository extends JpaRepository<Personaje, Long>{

    
}
