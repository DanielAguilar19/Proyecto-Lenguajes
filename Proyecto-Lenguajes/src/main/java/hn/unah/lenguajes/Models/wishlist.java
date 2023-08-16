package hn.unah.lenguajes.Models;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="wishlist")
@NoArgsConstructor
@AllArgsConstructor
public class wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idwishlist")
    private String idWIshlist;

    private String idproducto;

    @JsonIgnore	
	@OneToOne(mappedBy = "wishlist")
	private Clientes cliente;


}