package ders1;

public class Account {
	private String name;
	private int balance;
	
	Account(String name, int balance) {
		this.name = name;
		
		if (balance < 0) {
			System.out.println("balance can't be negative!");
			return;
		}
		
		this.balance = balance;
	}
	
	// setters & getters
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public void depositMoney(int amount) {
		if (amount < 0) {
			System.out.println("balance can't be negative!");
			return;
		}
		
		balance += amount;
	}
}
