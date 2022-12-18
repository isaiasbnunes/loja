package net.bragadev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bragadev.backend.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}
