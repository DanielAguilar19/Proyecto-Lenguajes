package hn.unah.lenguajes.service;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import hn.unah.lenguajes.Models.wishlist;
@Component
public interface wishlistService {

	public wishlist guardarProductowishlist(wishlist wishlist);
	
	public wishlist eliminarProductowishlist(wishlist wishlist);
	
}
