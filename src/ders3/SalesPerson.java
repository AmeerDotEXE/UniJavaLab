package ders3;

public class SalesPerson {
	private String name;
	static int productCount = 0;
	private int weeklyIncome = 1500;
	private double commissionRate = 0.05;
	private int soldProductCount;
	
	public SalesPerson(String name, int soldProductCount) {
		this.name = name;
		this.soldProductCount = soldProductCount;
		productCount += soldProductCount;
	}
	public double calculateTotalIncome() {
		double komisyon = soldProductCount*commissionRate*100;
		return weeklyIncome + komisyon;
	}
	
	public void show() {
		System.out.println("Sales person name: "+name);
		
		System.out.println("weekly income: "+weeklyIncome+"TL");
		
		System.out.println("commision total: "+soldProductCount*commissionRate*100+"TL");
		
		System.out.println("total income: "+calculateTotalIncome()+"TL");
		
		System.out.println("sold product count: "+soldProductCount);
		System.out.println("total product count: "+productCount);
		System.out.println("");
	}
}
