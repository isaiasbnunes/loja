package net.bragadev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bragadev.backend.entity.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Long>{
    
}
