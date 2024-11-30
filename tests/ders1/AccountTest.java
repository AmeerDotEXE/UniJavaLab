package ders1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void test() {
		Account k1 = new Account("Ahmet", 500);
		Account k2 = new Account("Mehmet", 2500);
		assertEquals("Ahmet", k1.getName());
		assertEquals("Mehmet", k2.getName());
		assertEquals(500, k1.getBalance());
		assertEquals(2500, k2.getBalance());
		k1.depositMoney(50);
		assertEquals(550, k1.getBalance());
		assertEquals(2500, k2.getBalance());
	}

}
