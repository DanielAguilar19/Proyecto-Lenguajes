package hn.unah.lenguajes.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.Models.Clientes;

public interface clienteRepository extends CrudRepository<Clientes, String>{
    
}
