package com.mariana.aulas.Dto;

import org.springframework.web.multipart.MultipartFile;

import com.mariana.aulas.model.TipoAula;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AulaDto(
		
		@NotNull(message = "Selecione a imagem")
		MultipartFile materia,
		
		@NotBlank @Size(max= 20, message ="O limite é de 20 caracteres")
		String conteudo, 
		
		@NotNull(message = "Selecione o tipo da aula")
		TipoAula tipoAula) {

}
