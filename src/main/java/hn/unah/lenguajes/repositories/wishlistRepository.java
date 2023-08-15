package hn.unah.lenguajes.repositories;
import org.springframework.data.repository.CrudRepository;
import hn.unah.lenguajes.Models.wishlist;

public interface wishlistRepository extends CrudRepository<wishlist, Long> {
    
}
