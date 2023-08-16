package hn.unah.lenguajes.Models;

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

import javax.persistence.CascadeType;

@Entity
@Table(name="clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcliente")
    private String idcliente;

    private String nombre;
    
    private String contrasenia;


    @Column(name="idcarrito")
    private String idcarrito;

    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idwishlist", referencedColumnName="idwishlist")
	private wishlist wishlist;

}
