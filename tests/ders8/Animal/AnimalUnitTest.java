package ders8.Animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalUnitTest {

	@Test
	public void test() {
		Animal a1 = new Animal(2);
		Spider s1 = new Spider();
        Cat c1 = new Cat();
        Cat c2 = new Cat("Tom");
        Fish f1 = new Fish();
        
        a1.walk();
        a1.eat();
        assertEquals(2, a1.legs);

        s1.eat();
        assertEquals(8, s1.legs);

        c1.eat();
        c1.play();
        assertEquals(4, c1.legs);
        assertEquals("Stray Cat", c1.getName());
        assertEquals("Tom", c2.getName());

        f1.eat();
        f1.walk();
        f1.play();
        assertEquals(0, f1.legs);
        assertEquals("Random Fish", f1.getName());
        f1.setName("Nemo");
        assertEquals("Nemo", f1.getName());
	}

}
