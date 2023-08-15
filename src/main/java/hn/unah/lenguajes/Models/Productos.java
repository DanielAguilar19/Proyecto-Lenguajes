package hn.unah.lenguajes.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idproductos;

    @Column(name="nombreproducto")
    private String nombreProducto;

    @Column(name="fechavencimiento")
    private Date FechaVencimiento;

    @Column(name="cantidadexistente")
    private int cantidadExistente;

    private String imagen;

}
