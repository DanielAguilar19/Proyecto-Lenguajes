package hn.unah.lenguajes.service;

import java.util.Optional;
import org.springframework.stereotype.Component;
import hn.unah.lenguajes.Models.Clientes;

@Component
public interface clienteService {
    
    public Clientes crearCliente(String nombre, String contrasenia);
	
	public Clientes eliminarCliente(Clientes cliente);
	
	public Optional<Clientes> buscarPorId(String idcliente);
}
