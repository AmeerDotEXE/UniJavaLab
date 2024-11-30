package ders4;

import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = input.nextLine();
		System.out.print("Enter Birth Year: ");
		int birthYear = input.nextInt();
		
		HeartRate hr = new HeartRate(name, birthYear);
		hr.show();
		
		input.close();
	}

}
