package br.com.residencia.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="diretor")
public class Diretor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_diretor;
	private String nome;
	
	@OneToMany
	@JoinColumn(name = "id_filme", referencedColumnName = "id_filme")
	Filme filme;

	public Integer getId_diretor() {
		return id_diretor;
	}

	public void setId_diretor(Integer id_diretor) {
		this.id_diretor = id_diretor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
}
