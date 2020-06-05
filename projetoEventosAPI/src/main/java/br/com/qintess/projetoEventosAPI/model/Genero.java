package br.com.qintess.projetoEventosAPI.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "genero")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="classificacao_etaria", nullable = false)
	private int classificacaoEtaria;
	
	@OneToMany(mappedBy = "genero", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Evento> eventos;

	@Override
	public String toString() {
		return "Genero [id=" + id + ", nome=" + nome + ", classificacaoEtaria=" + classificacaoEtaria + "]";
	}
}
