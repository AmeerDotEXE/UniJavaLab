package ders6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class Survey {

	public static void main(String[] args) {
		labQuestion();
	}

	public static void linkedlist() {
	    LinkedList<String> car = new LinkedList<String>();
	    
	    car.add("Volvo");
	    car.add("BMW");
	    car.add(0, "Mercedes");
	    
	    for (String ncar : car) {
	        System.out.println(ncar);
	    }
	}
	public static void hashmap() {
	    HashMap<String, Integer> m = new HashMap<String, Integer>();
	    
	    m.put("Ankara", 8);
	    m.put("Bolu", 14);
	    m.put("Istabul", 34);
	    
	    for (String city : m.keySet()) {
	        System.out.println(city+": "+m.get(city));
	    }
	}
	
	
	
	public static void labQuestion() {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, ArrayList<Integer>> m = new HashMap<String, ArrayList<Integer>>();
		
		m.put("question 1", new ArrayList<Integer>());
		m.put("question 2", new ArrayList<Integer>());
		m.put("question 3", new ArrayList<Integer>());
		m.put("question 4", new ArrayList<Integer>());
		m.put("question 5", new ArrayList<Integer>());
		
		while (true) {
			System.out.println("\n");
		    System.out.println("1) fill in survery");
		    System.out.println("2) survey results");
		    System.out.println("0) exit");
		    
		    int option = -1;
		    while (option < 0 || option > 2) {
		        System.out.print("choose: ");
		        option = input.nextInt();
		    }
			System.out.println("");
		    
		    switch (option) {
		        case 0:
		        	input.close();
		            return;
		        case 1:
		            for (String soru : m.keySet()) {
		                System.out.println(soru);
		                int secim = 0;
		                while (secim < 1 || secim > 10) {
		                    System.out.print("Rate from 1 to 10: ");
		                    secim = input.nextInt();
		                }
		                m.get(soru).add(secim);
		            }
		            break;
		        case 2:
		            String highestSurvey = "none";
		            float highestAvarage = -1.0f;
		            String lowestSurvey = "none";
		            float lowestAvarage = 11.0f;
		            
		            for (String question : m.keySet()) {
		                float currentAvarage = avarage(m.get(question));
		                System.out.println(question+" : "+currentAvarage);
		                
		                if (currentAvarage > highestAvarage) {
		                    highestAvarage = currentAvarage;
		                    highestSurvey = question;
		                }
		                if (currentAvarage < lowestAvarage) {
		                    lowestAvarage = currentAvarage;
		                    lowestSurvey = question;
		                }
		            }
		            
		            System.out.println("\nHighest Score");
		            System.out.println(highestSurvey+" : "+highestAvarage);
		            
		            System.out.println("\nLowest Score");
		            System.out.println(lowestSurvey+" : "+lowestAvarage);
		            
		            break;
		    }
		}
	}
	
	public static float avarage(ArrayList<Integer> liste) {
	    return ((float)totalPoint(liste)) / liste.size();
	}
	
	public static int totalPoint(ArrayList<Integer> liste) {
	    int total = 0;
	    
	    for (Integer num : liste) {
	        total += num;
	    }
	    
	    return total;
	}
}
