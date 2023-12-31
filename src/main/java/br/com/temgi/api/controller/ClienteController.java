package br.com.temgi.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.temgi.domain.model.Cliente;
import br.com.temgi.domain.repository.ClienteRepository;
import br.com.temgi.domain.service.CatalogoClienteService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	private ClienteRepository clienteRepository;
	private CatalogoClienteService clienteService;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
//		return clienteRepository.findByNome("Maria");
//		return clienteRepository.findByNomeContaining("a");
	}
//	@GetMapping("/clientes/{clienteId}")
//	public Cliente buscar(@PathVariable Long clienteId) {
//		return clienteRepository.findById(clienteId)
//				.orElse(null);
//	}
//	@GetMapping("/{clienteId}")
//	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {
//		Optional<Cliente> cliente = clienteRepository.findById(clienteId);
//		if(cliente.isPresent()) {
//			return ResponseEntity.ok(cliente.get());
//		}
//		return ResponseEntity.notFound().build();
//	}
	@GetMapping("/{clienteId}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {
		return clienteRepository.findById(clienteId)
//				.map(cliente -> ResponseEntity.ok(cliente))
				.map(ResponseEntity :: ok)
				.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@Valid @RequestBody Cliente cliente) {
//		return clienteRepository.save(cliente);
		return clienteService.salvar(cliente);
		
	}
	@PutMapping("/{clienteId}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Long clienteId, @Valid @RequestBody Cliente cliente) {
		if(!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		cliente.setId(clienteId);
//		cliente = clienteRepository.save(cliente);
		cliente = clienteService.salvar(cliente);
		return ResponseEntity.ok(cliente);
	}
	@DeleteMapping("/{clienteId}")
	public ResponseEntity<Void> remover(@PathVariable Long clienteId) {
		if(!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
//		clienteRepository.deleteById(clienteId);
		clienteService.excluir(clienteId);
		return ResponseEntity.noContent().build();
	}
}