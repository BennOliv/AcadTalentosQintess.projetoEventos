package br.com.qintess.projetoEventosAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.qintess.projetoEventosAPI.model.Cargo;

@CrossOrigin("http://localhost:4200")
public interface CargoRepository extends JpaRepository<Cargo, Long>{

	Cargo findByNome(@Param("nome") String nome);
}
