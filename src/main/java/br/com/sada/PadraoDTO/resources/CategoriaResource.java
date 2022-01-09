package br.com.sada.PadraoDTO.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.PadraoDTO.model.Categoria;
import br.com.sada.PadraoDTO.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@Autowired
	CategoriaService categService;

	@RequestMapping("/{id}")
	public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {

		Categoria obj = categService.listById(id);
		return ResponseEntity.ok().body(obj);

	}
	
	
	

}
