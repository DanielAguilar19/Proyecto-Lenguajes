package hn.unah.lenguajes.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.Models.Carrito;
import hn.unah.lenguajes.service.carritoService;

public class carritoImpl implements carritoService {
    @Autowired
	private CrudRepository carritoRepository;

	@Override
	public Carrito guardarProductoCarrito(Carrito carrito) {
		carritoRepository.save(carrito);
		return null;
	}

	@Override
	public Carrito eliminarProductoCarrito(Carrito carrito) {
		
		return null;
	}

	@Override
	public Optional<Carrito> buscarId(String idproducto) {
		Optional<Carrito> carrito = carritoRepository.findById(idproducto);
		return carrito;
	} 
}
