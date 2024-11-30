package com.mariana.aulas.model;

import java.util.UUID;

import com.mariana.aulas.Dto.AulaDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="aula")
public class AulaModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.UUID)
	private UUID id;
	
	private String material;
	private String conteudo;
	private TipoAula tipo_aula;
	
	public AulaModel(AulaDto dados) {
		this.material=dados.material();
		this.conteudo=dados.conteudo();
		this.tipo_aula=dados.tipoAula();
	}

}
