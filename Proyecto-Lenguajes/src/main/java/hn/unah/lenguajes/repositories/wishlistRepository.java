package hn.unah.lenguajes.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.Models.wishlist;
@Repository
public interface wishlistRepository extends CrudRepository<wishlist, String> {
    
}