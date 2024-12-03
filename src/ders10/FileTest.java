package ders10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) throws IOException {
		test1();
		test2();
		lab();
	}
	
	public static void test1() throws IOException {
		//file creation
		File dataFile = new File("X:\\Projects\\apps\\java\\UniJavaLab\\src\\ders10\\data.txt");
		if (!dataFile.exists()) {
			dataFile.createNewFile();
		}
		
		//data initialization
		ArrayList<String> infoList = new ArrayList<>();
		infoList.add("Ahmet Mehmet ");
		infoList.add("30");

		
		
		//write process
		FileWriter fwriter = new FileWriter(dataFile, false);
		BufferedWriter bwriter = new BufferedWriter(fwriter);

		for (String info : infoList) {
			bwriter.write(info);
		}
		bwriter.write("\nHello");

		bwriter.close();
		fwriter.close();
		
		
		
		//read process
		FileReader freader = new FileReader(dataFile);
		BufferedReader breader = new BufferedReader(freader);

		String line = breader.readLine();
		while (line != null) {
			System.out.println(line);
			line = breader.readLine();
		}

		breader.close();
		freader.close();
	}

	public static void test2() throws IOException {
		//file creation
		File dataFile = new File("X:\\Projects\\apps\\java\\UniJavaLab\\src\\ders10\\data.csv");
		if (!dataFile.exists()) {
			dataFile.createNewFile();
		}

		
		
		//write process
		FileWriter fwriter = new FileWriter(dataFile, false);
		BufferedWriter bwriter = new BufferedWriter(fwriter);

		bwriter.write("9;8;7\n");
		bwriter.write("6;5;4\n");

		bwriter.close();
		fwriter.close();
		
		
		
		//read process
		Scanner fscanner = new Scanner(dataFile);

		while (fscanner.hasNextLine()) {
			String line = fscanner.nextLine();
			String[] infoList = line.split(";");
			
			for (String info : infoList) {
				System.out.println(info);
			}
		}

		fscanner.close();
	}

	public static void lab() throws IOException {
		//file creation
		File dataFile = new File("X:\\Projects\\apps\\java\\UniJavaLab\\src\\ders10\\lab.csv");
		if (!dataFile.exists()) {
			dataFile.createNewFile();
		}

		
		
		//write process
		FileWriter fwriter = new FileWriter(dataFile, false);
		BufferedWriter bwriter = new BufferedWriter(fwriter);
		
		bwriter.write("Ahmet;Mehmet;30\n");
		bwriter.write("Hassan;Husseyin;34\n");

		bwriter.close();
		fwriter.close();
		
		
		
		//read process
		Scanner input = new Scanner(System.in);
		
		System.out.print("name: ");
		String fullName = input.nextLine();
		
		//find name
		Scanner fscanner = new Scanner(dataFile);

		while (fscanner.hasNextLine()) {
			String line = fscanner.nextLine();
			String[] infoList = line.split(";");
		
			String infoName = infoList[0] + " " + infoList[1];
			
			if (infoName.equalsIgnoreCase(fullName)) {
				System.out.println("\nWelcome "+infoName);
				System.out.println("Age: "+infoList[2]);
				fscanner.close();
				input.close();
				return;
			}
		}


		System.out.print("Not found");
		fscanner.close();
		
		input.close();
	}

}
