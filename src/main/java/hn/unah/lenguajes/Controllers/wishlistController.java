package hn.unah.lenguajes.Controllers;
import hn.unah.lenguajes.Models.wishlist;
import hn.unah.lenguajes.repositories.wishlistRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wishlist")
public class wishlistController {
    @Autowired
    private wishlistController wishlistRepository;

    @GetMapping
    public List<wishlist> obtenerWishlist() {
        return null;
        // Lógica para obtener y retornar la lista de deseos desde la base de datos
    }
/*
 * 
    @PostMapping("/add")
    public ResponseEntity<String> guardarProductowishlist(@RequestBody wishlistItemRequest request) {
        // Lógica para agregar un nuevo producto a la lista de deseos en la base de datos
    }

    @PostMapping("/{wishlistId}/delete")
    public ResponseEntity<String> eliminarProductowishlist(@PathVariable Long wishlistId) {
        // Lógica para eliminar un producto de la lista de deseos en la base de datos
    }

 */
}
