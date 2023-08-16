package hn.unah.lenguajes.service;

import java.util.Optional;

import hn.unah.lenguajes.Models.Carrito;

public interface carritoService {

	public Carrito guardarProductoCarrito(Carrito carrito);
	
	public Carrito eliminarProductoCarrito(Carrito carrito);
	
	public Optional<Carrito> buscarId(String idproducto);
}
