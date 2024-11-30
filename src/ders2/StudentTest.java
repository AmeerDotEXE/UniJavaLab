package ders2;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		Student s1 = new Student("me", input.nextInt());
		System.out.println("Students: ");
		System.out.print("1.Student: "+s1.getName()+" / ");
		System.out.println("Grade Letter: "+s1.getGradeLetter());
		
		input.close();
	}

}
