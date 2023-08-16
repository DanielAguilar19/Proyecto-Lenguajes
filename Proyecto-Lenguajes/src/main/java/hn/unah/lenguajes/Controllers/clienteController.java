package hn.unah.lenguajes.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.service.Impl.clienteImpl;
import hn.unah.lenguajes.Models.Clientes;

@RestController
@RequestMapping("/api/clientes")
public class clientesController {
	@Autowired
	private clienteImpl clienteImplementacionService;

	@GetMapping("/crear")
	public Clientes crearCliente(@RequestBody String nombre, String contrasenia) {
		return clienteImplementacionService.crearCliente(nombre, contrasenia);
	}

	@GetMapping("/buscar/{idcliente}")
	public Optional<Clientes> buscarCliente(@PathVariable(name = "idcliente") String idcliente) {
		return clienteImplementacionService.buscarPorId(idcliente);
	}

}   