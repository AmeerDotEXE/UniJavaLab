package ders8.Animal;

public class Fish extends Animal implements Pet {
    private String name;

    Fish() {
        super(0);
        name = "Random Fish";
    }
    
    public void setName(String Name) { name = Name; }
    public String getName() { return name; }
    
    public void play() {
        System.out.println("Playing Bubbles.");
    }
    
    public void walk() {
        System.out.println("Fishes dont walk.");
    }
    public void eat() {
        System.out.println("Eating Bubbles.");
    }
}
