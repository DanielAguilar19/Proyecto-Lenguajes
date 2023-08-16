package hn.unah.lenguajes.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Models.wishlist;
import hn.unah.lenguajes.repositories.wishlistRepository;
import hn.unah.lenguajes.service.wishlistService;

@Service
public class wishlistImpl implements wishlistService {
    @Autowired
	wishlistRepository wishlistRepository;
	
	@Override
	public wishlist guardarProductowishlist(wishlist wishlist) {
		wishlistRepository.save(wishlist);
		return null;
	}

	@Override
	public wishlist eliminarProductowishlist(wishlist wishlist) {
		wishlistRepository.deleteById(null);
		return null;
	}

}
