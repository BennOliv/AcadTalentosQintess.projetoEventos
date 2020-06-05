package br.com.qintess.projetoEventosAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.qintess.projetoEventosAPI.model.CasaShow;
import br.com.qintess.projetoEventosAPI.model.Genero;

@CrossOrigin("http://localhost:4200")
public interface GeneroRepository extends JpaRepository<Genero, Long>{

	@Query(value=" select * from genero g where g.nome like '%:nome%' ", nativeQuery = true)
	List<Genero> findByNome(@Param("nome") String nome);
	
	boolean existsByNome(String nome);
	
}
