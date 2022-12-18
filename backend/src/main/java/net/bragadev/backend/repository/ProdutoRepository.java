package net.bragadev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bragadev.backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
