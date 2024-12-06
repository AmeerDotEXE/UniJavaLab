package ders4;

import static org.junit.Assert.*;
import org.junit.Test;

public class HeartRateUnitTest {

	@Test
	public void test() {
		HeartRate hr = new HeartRate("Ahmet", 1999);
		assertEquals("Ahmet", hr.getName());
		assertEquals(1999, hr.getBirthYear());
		assertEquals(195, hr.maxHeartRate());
		assertEquals(156, hr.targetHeartRate());
	}

}
