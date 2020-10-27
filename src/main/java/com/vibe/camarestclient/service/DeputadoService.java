package com.vibe.camarestclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.vibe.camarestclient.model.Deputado;
import com.vibe.camarestclient.model.DeputadoDTO;
import com.vibe.camarestclient.model.DeputadoPorId;
import com.vibe.camarestclient.model.DeputadoPorIdDTO;


@Service
public class DeputadoService {

	@Autowired
	private WebClient webClient;

	public List<Deputado> getAll() {
		List<Deputado> resultDeputados = webClient.get()
				.uri("/deputados")
				.accept(MediaType.APPLICATION_JSON)
	            .retrieve()
				.bodyToMono(DeputadoDTO.class)
				.map(DeputadoDTO::getDeputados).block();
		
		for(Deputado res : resultDeputados) {
			DeputadoPorId resultDeputadosPorId = webClient.get()
					.uri("/deputados/{id}", res.getId())
					.accept(MediaType.APPLICATION_JSON)
		            .retrieve()
		            .bodyToMono(DeputadoPorIdDTO.class)
					.map(DeputadoPorIdDTO::getDeputadoPorId).block();
			
			res.setEscolaridade(resultDeputadosPorId.getEscolaridade());
			res.setSexo(resultDeputadosPorId.getSexo());
			res.setUfNascimento(resultDeputadosPorId.getUfNascimento());
			res.setCondicaoEleitoral(resultDeputadosPorId.getUltimoStatus().getCondicaoEleitoral());
		}

		return resultDeputados;
	}
}