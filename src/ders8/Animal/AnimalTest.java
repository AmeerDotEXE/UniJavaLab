package ders8.Animal;

public class AnimalTest {

	public static void main(String[] args) {
		Cat c1 = new Cat();
        Fish f1 = new Fish();
        Spider s1 = new Spider();
        Animal a1 = new Animal(2);
        
        c1.walk();
        s1.walk();
        f1.walk();
        a1.walk();
        
        c1.eat();
        s1.eat();
        f1.eat();
        a1.eat();
        
        c1.play();
        f1.play();
	}

}
