package com.curso.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		Cliente cliente1 = new Cliente();
		cliente1.setId(1);
		cliente1.setNome("Rafael Brito");
		cliente1.setTelefone("11 97784-2283");
		cliente1.setEmail("rafael@rafael.com.br");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2);
		cliente2.setNome("Mayara");
		cliente2.setTelefone("11 94727-9150");
		cliente2.setEmail("mayara@mayara.com.br");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
