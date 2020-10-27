package com.vibe.camarestclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deputado {

	private Long id;
	private String nome;
	private Long idLegislatura;
	
	private String escolaridade;
	private String sexo;
	private String ufNascimento;
	private String condicaoEleitoral;
}
