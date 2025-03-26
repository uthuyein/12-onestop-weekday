package com.jdc.mkt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "account_tbl")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 20)
	private String loginId;
	
	@Column(nullable = false,length = 20)
	private String password;
	
	private Role role;
	
	public enum Role{
		ADMIN,CASHIER,CUSTOMER ;
	}
}
