package br.com.sada.PadraoDTO.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sada.PadraoDTO.model.Categoria;
import br.com.sada.PadraoDTO.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository categRepo;

	public List<Categoria> listaAll() {
		return categRepo.findAll();
	}

	public Categoria listById(Long id) {
		Optional<Categoria> obj = categRepo.findById(id);
		return obj.orElse(null);  //se não encontrar nada vai retornar null;

	}

}
