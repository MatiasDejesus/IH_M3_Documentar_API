package com.yugioh.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yugioh.Entity.Carta;


@Repository
public interface cartaRepository extends JpaRepository<Carta, Long> {
   

   
}




