package ders4;

public class HeartRate {

	private String name;
	private int birthYear;
	private static final int currentYear = 2024; 
	
	public HeartRate(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	// setters & getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
	public int maxHeartRate() {
		return 220-(currentYear-birthYear);
	}
	public int targetHeartRate() {
		return (int)(maxHeartRate() * 0.8);
	}
	
	public void show(){
		System.out.println("Name: "+ name);
		System.out.println("Birth Year: "+ birthYear);
		System.out.println("MHR: "+ maxHeartRate());
		System.out.println("THR: "+ targetHeartRate());
	}
}
