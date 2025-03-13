package com.jdc.mkt.dto;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	public String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	public Address(Address a) {
		this.city = a.city;
	}
}
