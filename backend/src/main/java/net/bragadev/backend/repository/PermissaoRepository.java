package net.bragadev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bragadev.backend.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long>{
    
}
