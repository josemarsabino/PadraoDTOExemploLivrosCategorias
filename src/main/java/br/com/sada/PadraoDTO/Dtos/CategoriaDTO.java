package br.com.sada.PadraoDTO.Dtos;

import java.io.Serializable;

import br.com.sada.PadraoDTO.model.Categoria;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String descricao;
	public CategoriaDTO() {
		
	}
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "CategoriaDTO [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}
	
	
	
	
	
	

}
