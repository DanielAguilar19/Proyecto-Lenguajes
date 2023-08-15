package hn.unah.lenguajes.Models;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWIshlist;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private cliente cliente;

    // Otras propiedades y relaciones según sea necesario

    // Getters y setters

}
