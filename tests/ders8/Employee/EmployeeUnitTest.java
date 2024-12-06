package ders8.Employee;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeUnitTest {

	@Test
	public void test() {
        Employee e1 = new Employee("Ahmet", "Mehmet");
        Employee e2 = new Employee("Hassan", "Huseyin", 40_000);
        Engineer en1 = new Engineer("Yusuf", "Yildiz", 65_000);
        Worker w1 = new Worker("Yusuf", "Yildiz");
        
        e1.infoBox();
        e1.test();
        assertEquals(30_000, e1.getSalary());
        assertEquals(10, e1.getAnnualPermit());
        assertEquals(33_000, e1.makeRaise(3_000));
        assertEquals("Caliskan", e1.getJob());
        
        assertEquals(40_000, e2.getSalary());
        assertEquals(15, e2.getAnnualPermit());
        assertEquals(43_000, e2.makeRaise(3_000));
        assertEquals("Kidemli Caliskan", e2.getJob());

        en1.infoBox();
        en1.test();
        en1.gender("pc");
        assertEquals(65_000, en1.getSalary());
        assertEquals(15, en1.getAnnualPermit());
        assertEquals(78_000, en1.makeRaise(3_000));
        assertEquals("Kidemli Muhendis", en1.getJob());

        w1.infoBox();
        w1.gender("brick");
        assertEquals(45_000, w1.getSalary());
        assertEquals(10, w1.getAnnualPermit());
        assertEquals(58_000, w1.makeRaise(3_000));
        assertEquals("Teknisyen", w1.getJob());
	}

}
