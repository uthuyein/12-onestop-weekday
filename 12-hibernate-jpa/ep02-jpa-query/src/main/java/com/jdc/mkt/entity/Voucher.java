package com.jdc.mkt.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "voucher_tbl")
public class Voucher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "sale_date")
	private LocalDate saleDate;
	
	@Column(name = "sale_time")
	private LocalTime saleTime;
	
	@Column(name = "sub_total")
	private Double subTotal;
	
	private Double total;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private Account account;
}
