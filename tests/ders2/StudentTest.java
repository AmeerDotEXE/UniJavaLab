package ders2;

import static org.junit.Assert.*;

import org.junit.Test;

import ders1.Account;

public class StudentTest {

	@Test
	public void test() {
		Student s1 = new Student("Ahmet", 77);
		Student s2 = new Student("Mehmet", 47);
		assertEquals("Ahmet", s1.getName());
		assertEquals("Mehmet", s2.getName());
		assertEquals("CB", s1.getGradeLetter());
		assertEquals("FF", s2.getGradeLetter());
	}

}
