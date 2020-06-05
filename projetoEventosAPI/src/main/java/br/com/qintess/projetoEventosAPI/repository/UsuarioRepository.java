package br.com.qintess.projetoEventosAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.qintess.projetoEventosAPI.model.Usuario;

@CrossOrigin("http://localhost:4200")
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query(value=" select * from usuario u where u.nome like '%:nome%' ", nativeQuery = true)
	List<Usuario> findByNome(@Param("nome") String nome);
	
	@Query(value=" select * from usuario u where u.cidade like '%:cidade%' ", nativeQuery = true)
	List<Usuario> findByCidade(@Param("cidade") String cidade);
	
	boolean existsByNome(String nome);
	
}
