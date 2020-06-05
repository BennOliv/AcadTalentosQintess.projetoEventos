package br.com.qintess.projetoEventosAPI.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.qintess.projetoEventosAPI.model.Evento;

@CrossOrigin("http://localhost:4200")
public interface EventoRepository extends JpaRepository<Evento, Long>{
	
	@Query(value=" select * from evento e where e.nome like '%:nome%' ", nativeQuery = true)
	List<Evento> findByNome(@Param("nome") String nome);
	
	@Query(value=" select * from evento e where e.id_casa_show = :casa ", nativeQuery = true)
	List<Evento> findByIdCasaShow(@Param("casa") Long id);
	
	@Query(value=" select * from evento e where e.id_genero = :id ", nativeQuery = true)
	List<Evento> findByIdGenero(@Param("id") Long id);
	
	//Talveeeeeez dê pau xDD
	//qlqr coisa só deleta :3 (não necessário)
	/**
	 * Encontra Eventos por data.
	 * @param data use o pattern="yyyy/MM/dd" para evitar bugs
	 * @return Lista de Eventos na data solicitada.
	 */
	@Query(value=" select * from evento e where e.data = :data ", nativeQuery = true)
	List<Evento> findByData(@Param("data") LocalDate data);
	
	boolean existsByNome(String nome);
	
}