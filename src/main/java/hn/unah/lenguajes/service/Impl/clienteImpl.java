package hn.unah.lenguajes.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Models.Clientes;
import hn.unah.lenguajes.repositories.clienteRepository;

@Service
public class clienteImpl extends Clientes {

    @Autowired
    private clienteRepository clientesRepositorio;

    public Clientes crearCliente(String nombre, String contrasenia) {
        Clientes nuevocliente = new Clientes();
        nuevocliente.setNombre(nombre);
        nuevocliente.setContrasenia(contrasenia);

        return clientesRepositorio.save(nuevocliente);
        
    }

    public Clientes eliminarCliente(Clientes cliente) {
        return null;
    }

    public Optional<Clientes> buscarPorId(String idcliente) {
        Optional<Clientes> cliente = clientesRepositorio.findById(idcliente);
		return cliente;
        
    }

}