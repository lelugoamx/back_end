package br.com.example.banco.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.example.banco.model.Carro;

public interface CarroRepository  extends CrudRepository<Carro, Integer> {
    @Query("Select c From Carro c Where c.nome LIKE %:nome%")
    Iterable<Carro> findByName(String nome);
}
