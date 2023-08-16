package hn.unah.lenguajes.service;

import java.util.Optional;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import hn.unah.lenguajes.Models.wishlist;

@Component
public interface wishlistService {
	@Autowired
	wishlistRepository wishlistRepositorio;

	public wishlist guardarProductowishlist(wishlist wishlist){
		return wishlistRepositorio.save(wishlist)
	}
	
	public wishlist eliminarProductowishlist(String wishlistId){
		return wishlistRepositorio.deleteById(wishlistId)
	}
	
}
/*
 * package hn.unah.lenguajes.service;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import hn.unah.lenguajes.Models.wishlist;
@Component
public interface wishlistService {

	public wishlist guardarProductowishlist(wishlist wishlist);
	
	public wishlist eliminarProductowishlist(wishlist wishlist);
	
}
 */