package br.com.example.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.banco.model.Carro;
import br.com.example.banco.repository.CarroRepository;

@RestController
@RequestMapping("/Carros")
public class CarroController {
	
	@Autowired
	private CarroRepository carroRepository;
	
	@GetMapping
	public Iterable<Carro> buscarCarros(){
		return carroRepository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Carro busacaCarroPorId(@PathVariable int id) {
		return carroRepository.findById(id).orElse(null);	
		}
	@GetMapping("/nome/{nome}")
	public Iterable<Carro> busacaCarroPorNome(@PathVariable String nome) {
		return carroRepository.findByName(nome);
		}
	
	//para add um carro//
	
	@PostMapping
	public Carro adicionarCarro(@RequestBody Carro carro) {
		return carroRepository.save(carro);
	}
	
	//para att um objeto carro//
	@PutMapping("/{id}")
	public Carro atualizarCarro(@PathVariable int id, @RequestBody Carro carro) {
		return carroRepository.save(carro);
	}	
	//deletar um objeto carro//
		@DeleteMapping("/{id}")
		public void  detelarcarro(@PathVariable int id) {
			 carroRepository.deleteById(id);
		
		
	}

}
