package ders8.Animal;

public class Animal {
    protected int legs;
    
    protected Animal(int _legs) {
        legs = _legs;
    }
    
    public void walk() {
        System.out.println(legs+" Foot step nioses.");
    }
    public void eat() {
        System.out.println("Generic Eating nioses.");
    }
}
