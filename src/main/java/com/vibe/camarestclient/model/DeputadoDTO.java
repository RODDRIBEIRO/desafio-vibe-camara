package com.vibe.camarestclient.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeputadoDTO {
	@JsonProperty("dados")
	private List<Deputado> deputados = new ArrayList<>();
}
