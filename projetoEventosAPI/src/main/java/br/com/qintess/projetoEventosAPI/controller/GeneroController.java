package br.com.qintess.projetoEventosAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qintess.projetoEventosAPI.model.Genero;
import br.com.qintess.projetoEventosAPI.repository.GeneroRepository;

@RestController
@RequestMapping("/genero")
public class GeneroController {

	@Autowired
	private GeneroRepository repo;
	
	@GetMapping
	public List<Genero> buscaGenero(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public Genero buscaGeneroById(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	
	@PostMapping
	public long criaGenero(@RequestBody Genero genero){
		repo.save(genero);
		
		return genero.getId();
	}
	
	@PutMapping
	public void alteraGenero(@RequestBody Genero genero){
		repo.save(genero);
	}
	
	@DeleteMapping
	public void deletaGenero(@RequestBody Genero genero) {
		repo.delete(genero);
	}
}
