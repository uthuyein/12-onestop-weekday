package com.jdc.mkt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ExcludeDefaultListeners
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NonNull
	private String userName;
	@NonNull
	private String email;
	@NonNull
	private String password;
	
	@PrePersist
	void prePersist() {
		System.out.println("Before persist operation");
	}
	
	@PostPersist
	void postPersist() {
		System.out.println("After persist operation");
	}
}
