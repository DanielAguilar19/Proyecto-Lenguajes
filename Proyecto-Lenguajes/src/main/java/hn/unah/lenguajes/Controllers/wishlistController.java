package hn.unah.lenguajes.Controllers;
import hn.unah.lenguajes.Models.wishlist;
import hn.unah.lenguajes.service:wishlistService;
import hn.unah.lenguajes.repositories.wishlistRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wishlist")
public class wishlistController {
    @Autowired
    wishlistService wishlistServicio

    @PostMapping("/agregar")
    public ResponseEntity<String> guardarProductowishlist(@RequestBody wishlist wishlist) {
        return wishlistRepository.save(wishlist)    
    }

    @PostMapping("/{wishlistId}/delete")
    public ResponseEntity<String> eliminarProductowishlist(@PathVariable String wishlistId) {
        return null;
    }


}