package hn.unah.lenguajes.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="carrito")
public class Carrito{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="idcarrito")
private String idcarrito;

@Column(name= "usuarioid")
private Integer usuarioid;

@Column (name="idproductos")
private String idproductos;

@Temporal(TemporalType.DATE)
@Column (name="crearfecha")
private Date crearfecha;

@Column(name="cantidad")
private Integer cantidad;

@Column(name="totalpagar")
private Double totalpagar;

@Column(name="itemscarrito")
private Integer itemscarrito;
}
