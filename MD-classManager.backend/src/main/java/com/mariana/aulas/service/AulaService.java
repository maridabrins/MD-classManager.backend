package com.mariana.aulas.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariana.aulas.model.AulaModel;
import com.mariana.aulas.repository.AulaRepository;

@Service
public class AulaService {
	
	@Autowired
	private AulaRepository repository;
	
	//metodo para criar uma aula
	public AulaModel saveAula(AulaModel aula) {
		return repository.save(aula);
		
	}
	//metodo para listar todas as aulas
	public List<AulaModel> getAula(){
		return repository.findAll();
	}
	//metodo para buscar por id
	public AulaModel getAulaById(UUID id) {
		return repository.findById(id).get();
	}
	//método para atualizar por id
	public AulaModel updateAula(UUID id, AulaModel aula) {
		AulaModel aulaAtualizada =  repository.findById(id).get();;
		aulaAtualizada.setMaterial(aula.getMaterial());
		aulaAtualizada.setConteudo(aula.getConteudo());
		aulaAtualizada.setTipo_aula(aula.getTipo_aula());;
		return repository.save(aula);
	}
	
	public void deleteAula(UUID id) {
		repository.deleteById(id);
	}
	   
	

}
