package hn.unah.lenguajes.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.Models.Carrito;


public interface carritoRepository extends CrudRepository<Carrito, String>{
    
}