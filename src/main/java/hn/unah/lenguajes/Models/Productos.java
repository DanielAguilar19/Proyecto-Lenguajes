package hn.unah.lenguajes.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Table;
@Entity
@Getter
@Setter
@Table(name="productos")
@NoArgsConstructor
@AllArgsConstructor
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
