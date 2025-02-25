package com.jdc.mkt.enum_test;

public class Main {
		
	class Days{
		static final int MON = 0;
		static final int TUE = 1;
		static final int WED = 2;
		static final int THUR = 3;
		static final int FRI = 4;
		static final int SAT = 5;
		static final int SUN = 6;
	}
	
	enum Day implements Animal{
		MON(2,15) {
			@Override
			public String getDay() {
				return "Monday";
			}
		},TUE(3,8){
			@Override
			public String getDay() {
				return "Tuesday";
			}
		},WED(4,17){
			@Override
			public String getDay() {
				return "Wednesday";
			}
		},THUR(5,19){
			@Override
			public String getDay() {
				return "Thursday";
			}
		},FRI(6,21){
			@Override
			public String getDay() {
				return "Friday";
			}
		},SAT(7,10){
			@Override
			public String getDay() {
				return "Saturday";
			}
		},SUN(1,6){
			@Override
			public String getDay() {
				return "Sunday";
			}
		};
		
		private int indexOfYear;
		private int ageOfYear;
		
		//abstract String getDay();
		
		// construct by each constant
		private Day(int indexOfYear,int ageOfYear){
			this.indexOfYear = indexOfYear;
			this.ageOfYear = ageOfYear;
		}
		
		int getIndexOfYear() {
			return indexOfYear;
		}
		
		int getAgeOfYear() {
			return ageOfYear;
		}
		
	}

	public static void main(String[] args) {
		
		Day d2 = Day.THUR;
		System.out.println(d2+"\t"+d2.getDay());
		
		
	/*
		Day day = Day.THUR;
		int days = Days.THUR;
		
		System.out.println(day);
		System.out.println(days);
		
		Day d1 =  Day.valueOf("MON");
		System.out.println(d1);
		
		System.out.println();
		
		Day[] values = Day.values();
		for (Day d : values) {
			System.out.println(d);
		}
		
		System.out.println();
		System.out.println(Day.MON.ordinal());
		System.out.println(Day.TUE.name());
		
		*/
		
	}
}

interface Animal {
	abstract String getDay();
}









