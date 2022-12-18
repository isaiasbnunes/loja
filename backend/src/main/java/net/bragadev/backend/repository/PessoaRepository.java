package net.bragadev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bragadev.backend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
