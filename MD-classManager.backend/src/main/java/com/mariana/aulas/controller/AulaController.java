package com.mariana.aulas.controller;

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

import com.mariana.aulas.model.AulaModel;
import com.mariana.aulas.service.AulaService;

@RequestMapping
@RestController
public class AulaController {
	
	@Autowired
	private AulaService service;
	
	@GetMapping("/aulas")
	public List<AulaModel> getAulas(){
		return service.getAula();
	}
	
	@GetMapping("/aulas/{id}")
	public AulaModel getAula(@PathVariable int id) {
		return service.getAulaById(id);
	}
	  
    @PostMapping("/aulas/criar-nova")
    public AulaModel createAula(@RequestBody AulaModel aula) {
    	return service.saveAula(aula);
    }
    
   @PutMapping("/aulas/editar/{id}")
   public AulaModel updateAula(@PathVariable int id, @RequestBody AulaModel aula) {
	   return service.updateAula(id, aula);
   }
	
   @DeleteMapping("/aulas/deletar/{id}")
   public void deleteAula(@PathVariable int id) {
	 service.deleteAula(id);
   }
	
	

}
