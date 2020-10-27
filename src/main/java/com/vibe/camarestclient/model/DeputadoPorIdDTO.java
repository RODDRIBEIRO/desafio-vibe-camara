package com.vibe.camarestclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeputadoPorIdDTO {
	@JsonProperty("dados")
	private DeputadoPorId deputadoPorId;
}