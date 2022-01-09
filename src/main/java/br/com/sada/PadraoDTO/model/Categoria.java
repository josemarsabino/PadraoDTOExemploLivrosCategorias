package br.com.sada.PadraoDTO.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String descricao;
	
	@OneToMany(mappedBy="categoria")
	private List<Livro> livros = new ArrayList<Livro>();

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

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Long id, String nome, String descricao, List<Livro> livros) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", livros=" + livros + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
	
	
	
	

}
