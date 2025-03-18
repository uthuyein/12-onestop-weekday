package com.jdc.mkt.calculators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jdc.mkt.dto.MaharboteSign;

public class MaharboteCalculator {

	public static List<MaharboteSign> getSign(int myanmarYear, int dayName) {
		List<MaharboteSign> list = Arrays.asList(MaharboteSign.values());
		if (myanmarYear > 0 && dayName > 0) {

			int[] maharboteArray = getMaharBote(myanmarYear);
			int index = getIndex(dayName, maharboteArray);

			return new ArrayList<MaharboteSign>(List.of(list.get(index)));

		} else {
			return list;
		}
	}

	public static int[] getMaharBote(int myanmarYear) {

		int[] formulaArray = { 1, 4, 0, 3, 6, 2, 5 };
		int remainder = myanmarYear % 7;

		int index = getIndex(remainder, formulaArray);

		int[] maharboteArray = new int[formulaArray.length];

		for (int j = 0; j < maharboteArray.length; j++) {

			maharboteArray[j] = formulaArray[index];

			if (index < formulaArray.length) {
				index++;
			}
			if (index == 7) {
				index = 0;
			}

		}
		return maharboteArray;
	}

	private static int getIndex(int remainder, int[] array) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == remainder) {
				index = i;
			}
		}
		return index;
	}
}