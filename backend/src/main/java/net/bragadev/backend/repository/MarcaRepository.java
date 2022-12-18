package net.bragadev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bragadev.backend.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
    
}
