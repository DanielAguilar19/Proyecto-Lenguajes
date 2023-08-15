package hn.unah.lenguajes.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.Models.wishlist;
import hn.unah.lenguajes.service.wishlistService;

public class wishlistImpl implements wishlistService {
    @Autowired
	private CrudRepository wishlistRepository;

	@Override
	public wishlist guardarProductowishlist(wishlist wishlist) {
		wishlistRepository.save(wishlist);
		return null;
	}

	@Override
	public wishlist eliminarProductowishlist(wishlist wishlist) {
		
		return null;
	}

}
