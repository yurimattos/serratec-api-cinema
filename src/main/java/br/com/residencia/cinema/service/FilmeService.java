package br.com.residencia.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.cinema.entity.Filme;
import br.com.residencia.cinema.repository.FilmeRepository;

@Service
public class FilmeService {
	@Autowired
	FilmeRepository filmeRepository;
	
	public List<Filme> getAllFilmes(){
		return filmeRepository.findAll();
	}
	
	public Filme getFilmeById(Integer id) {
		return filmeRepository.findById(id).orElse(null);
	}
	
	public Filme saveFilme(Filme filme) {
		return filmeRepository.save(filme);
	}
	
	public Filme updateFilme(Filme filme, Integer id) {
		Filme filmeAtual = getFilmeById(id);
		
		filmeAtual.setNome_br(filme.getNome_br());
		filmeAtual.setNome_en(filme.getNome_en());
		filmeAtual.setAno_lancamento(filme.getAno_lancamento());
		filmeAtual.setSinopse(filme.getSinopse());

		return filmeRepository.save(filmeAtual);
	}
	
	public Filme deleteFilme(Integer id) {
		filmeRepository.deleteById(id);
		
		return getFilmeById(id);
	}
}
