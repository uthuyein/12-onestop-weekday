package com.jdc.mkt.maharbote;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.calculators.PlanetCalculator;
import com.jdc.mkt.dto.Planet;

public class MaharboteTest {

	@Test
	void planetSignTest() {
		PlanetCalculator cal = new PlanetCalculator();
		Planet planet = cal.getPlanetSign(LocalDate.of(1982, 3, 18), "Thursday");
		System.out.println(planet);
	}
}
