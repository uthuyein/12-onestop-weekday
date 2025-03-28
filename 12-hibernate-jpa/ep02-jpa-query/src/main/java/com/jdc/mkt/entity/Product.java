package com.jdc.mkt.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product_tbl" )
@NamedQuery(name = "pWithBetween",
	query = "select p from Product p where p.price between :first and :second")
@NamedQuery(name = "selectProductByCategory",
	query = "select p from Product p where p.category.name = :category")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	private Double price;
	
	@Column(columnDefinition = "tinyint(1) default 1")
	private boolean active;
	
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy = "product")
	private List<VoucherDetail> voucherDetails;
}
