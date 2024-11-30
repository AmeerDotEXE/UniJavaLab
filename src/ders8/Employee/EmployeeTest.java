package ders8.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ahmet", "Mehmet");
        e1.infoBox();
    
        Employee e2 = new Employee("Hassan", "Huseyin", 40_000);
        e2.infoBox();
        System.out.println("yeni maas: "+e2.makeRaise(10_000));
        
        Engineer en1 = new Engineer();
        en1.setName("Ali");
        en1.setSurName("Veli");
        en1.setJob("Muhendis");
        en1.setAnnualPermit(30);
        en1.setSalary(100_000);
        en1.infoBox();
        en1.test();
        
        Engineer en2 = new Engineer("Yusuf", "Yildiz", 65_000);
        en2.infoBox();
	}

}
