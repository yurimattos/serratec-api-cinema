package br.com.residencia.cinema.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="genero")
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_genero")
	private Integer idGenero;
	
	@Column(name="descricao")
	private String descricao;
	
	@OneToMany(mappedBy = "genero")
	Set<Filme> filme;

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Filme> getFilme() {
		return filme;
	}

	public void setFilme(Set<Filme> filme) {
		this.filme = filme;
	}
	
	
}
