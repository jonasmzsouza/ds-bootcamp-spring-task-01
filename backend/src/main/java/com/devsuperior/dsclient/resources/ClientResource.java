package com.devsuperior.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Antônio Bastos", "111111111-11", 6000.0, Instant.parse("1991-01-01T11:11:11Z"), 1));
		list.add(new Client(2L, "Camila Duarte", "222222222-22", 8000.0, Instant.parse("1992-02-02T22:22:22Z"), 2));
		return ResponseEntity.ok().body(list);
	}

}
