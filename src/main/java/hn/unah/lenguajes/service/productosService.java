package hn.unah.lenguajes.service;


import java.util.Optional;
import org.springframework.stereotype.Component;

import hn.unah.lenguajes.Models.Productos;

@Component
public interface productosService {
    
    

    public Optional<Productos> obtenerProductoIndividual (String idproductos);
    

  
}
