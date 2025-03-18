package com.jdc.mkt.calculators;

import java.time.LocalDate;
import java.time.Period;

import com.jdc.mkt.dto.Planet;

public class PlanetCalculator {

	public Planet getPlanetSign(LocalDate dob,String dayName) {
		
		int modulo = getAge(dob)%8;
		int ordinal = Planet.valueOf(dayName).ordinal();
		
		for(int x = 0; x < modulo ;x++) {
			if(ordinal < Planet.values().length - 1) {
				ordinal ++ ;
			}else {
				ordinal = 0;
			}
		}
		return Planet.values()[ordinal];
	}
	
	private int getAge(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears();
	}
}
