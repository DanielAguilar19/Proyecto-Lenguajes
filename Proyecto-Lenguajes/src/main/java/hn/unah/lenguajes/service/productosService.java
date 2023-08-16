package hn.unah.lenguajes.service;


import java.util.Optional;

import hn.unah.lenguajes.Models.Productos;


public interface productosService {
    
    

    public Optional<Productos> obtenerProductoIndividual (String idproductos);
    

  
}
