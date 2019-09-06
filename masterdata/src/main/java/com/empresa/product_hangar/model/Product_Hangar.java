package com.empresa.product_hangar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@IdClass(Product_Hangar_Id.class)
@Table(name="product_hangar")
@Getter @Setter
public class Product_Hangar {

	
	@Id
	@Column(name="hangarpk")
	private Long hangarPk;
	
	@Id
	@Column(name="productpk")
	private Long productPk;
	
	@Column(name="qty")
	private Integer qty;

	
}
