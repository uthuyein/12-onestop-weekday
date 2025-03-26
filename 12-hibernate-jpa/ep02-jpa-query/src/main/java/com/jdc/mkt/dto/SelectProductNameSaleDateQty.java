package com.jdc.mkt.dto;

import java.time.LocalDate;

public record SelectProductNameSaleDateQty(
		String name,
		LocalDate saleDate,
		long qty
		) {

}
