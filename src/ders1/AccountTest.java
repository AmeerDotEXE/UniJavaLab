package ders1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account k1 = new Account("Ahmet", 500);
		Account k2 = new Account("Mehmet", 2500);
		
		System.out.println("Users: ");
		System.out.print("1.User: "+k1.getName()+" / ");
		System.out.println("Balance: "+k1.getBakiye());
		System.out.print("2.User: "+k2.getName()+" / ");
		System.out.println("Balance: "+k2.getBakiye());
		
		System.out.println("how much you want to deposit?: ");
		int cash = input.nextInt();
		k1.depositMoney(cash);  
		System.out.println("1.User: "+k1.getBakiye());
		System.out.println("2.User: "+k2.getBakiye());
		
		input.close();
	}

}
