package br.com.sada.PadraoDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sada.PadraoDTO.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
