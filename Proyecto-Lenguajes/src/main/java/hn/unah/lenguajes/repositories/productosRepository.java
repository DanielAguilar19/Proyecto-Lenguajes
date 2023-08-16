package hn.unah.lenguajes.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.Models.Productos;

public interface productosRepository extends CrudRepository<Productos, String>{
    
}
