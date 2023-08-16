package hn.unah.lenguajes.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.service.Impl.productosImpl;
import hn.unah.lenguajes.Models.Productos;

@RestController
@RequestMapping("/api/productos")
public class productosController {
    @Autowired
	private productosImpl productoImplementacionService;

    @GetMapping("/buscar/{id}")
	public Optional<Productos> buscarCliente(@PathVariable(name="id") String id) {
		return productoImplementacionService.obtenerProductoIndividual(id);
	}


}