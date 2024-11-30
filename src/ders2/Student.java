package ders2;

public class Student {
	private String name;
	private int grade;
	
	Student(String name, int grade){
		this.name = name;
		
		if (grade < 0 || grade > 100) {
			System.out.println("invalid grade!");
			return;
		}
		this.grade = grade;
	}
	
	// setters & getters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String getGradeLetter() {
		// i know there is a cleaner way
		// but teacher wants it this way
		
		if (grade >= 90)
			return "AA";
	    else if (grade >= 85)
	    	return "BA";
	    else if (grade >= 80)
	    	return "BB";
	    else if (grade >= 75)
	    	return "CB";
	    else if (grade >= 70)
	    	return "CC";
	    else if (grade >= 65)
	    	return "DC";
	    else if (grade >= 60)
	    	return "DD";
	    else if (grade >= 55)
	    	return "FD";
    	return "FF";
	}
}
