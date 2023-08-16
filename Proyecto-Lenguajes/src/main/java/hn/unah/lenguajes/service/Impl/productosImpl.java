package hn.unah.lenguajes.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Models.Productos;
import hn.unah.lenguajes.repositories.productosRepository;

@Service
public class productosImpl extends Productos{

    @Autowired
    private productosRepository productoRepositorio;


    public Optional<Productos> obtenerProductoIndividual(String idproducto) {
		Optional<Productos> producto = productoRepositorio.findById(idproducto);
		return producto;}

}
