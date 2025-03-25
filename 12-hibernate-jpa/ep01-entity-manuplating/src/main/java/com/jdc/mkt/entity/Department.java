package com.jdc.mkt.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="department_tbl")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false,length = 45)
	private String name;
	@Column(columnDefinition = "tinyint(1) default 1")
	private boolean active;
	
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
}
