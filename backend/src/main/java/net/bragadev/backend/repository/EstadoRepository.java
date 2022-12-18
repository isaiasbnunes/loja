package net.bragadev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bragadev.backend.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
}
