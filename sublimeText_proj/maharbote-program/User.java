public class User{
	private String name;
	private int year;
	private int month;
	private int day;
	private int dayName;

	public User(String name,int year,int month,int day,int dayName){
		this.name = name ;
		this.year = year ;
		this.month = month ;
		this.day = day ;
		this.dayName =  dayName ;
	}

	public String getName(){
		return name;
	}
	public int getYear(){
		return year ;
	}
	public int getMonth(){
		return month ;
	}
	public int getDay(){
		return day ;
	}
	public int getDayName(){
		return dayName ;
	}
}