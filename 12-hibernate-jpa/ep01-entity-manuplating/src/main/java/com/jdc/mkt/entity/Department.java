package com.jdc.mkt.entity;

import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.listeners.EnableTimesListener;
import com.jdc.mkt.listeners.Times;
import com.jdc.mkt.listeners.TimesListener;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "department_tbl")
@EntityListeners(TimesListener.class)
public class Department implements EnableTimesListener {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NonNull
	@Column(nullable = false, length = 45)
	private String name;

	@Column(columnDefinition = "tinyint(1) default 1")
	private boolean active;

	@Embedded
	private Times times;

	@OneToMany(mappedBy = "department", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Employee> employees = new ArrayList<Employee>();

	public void addEmployee(Employee emp) {
		emp.setDepartment(this);
		employees.add(emp);
	}
}
