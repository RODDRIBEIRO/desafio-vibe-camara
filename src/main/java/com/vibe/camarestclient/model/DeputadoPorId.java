package com.vibe.camarestclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeputadoPorId {
	private Long id;
	private String escolaridade;
	private String sexo;
	private String ufNascimento;
	private String condicaoEleitoral;
	private UltimoStatus ultimoStatus;
}
