package com.jdc.mkt.entity;

import java.time.LocalDate;

import com.jdc.mkt.listeners.EnableTimesListener;
import com.jdc.mkt.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "employee_tbl")
//@EntityListeners(TimesListener.class)
public class Employee implements EnableTimesListener{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NonNull
	@Column(nullable = false,length = 45)
	private  String name;
	
	@NonNull
	@Column(nullable = false)
	private  LocalDate dob;
	
	@Column(nullable = false,columnDefinition = "tinyint(1) default 1")
	private boolean active;
	
	@Embedded
	private Times times;
	
	@OneToOne(optional = true,fetch = FetchType.LAZY)
	private Address address;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	private Department department;
	
	
}
