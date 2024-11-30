package ders8.Animal;

public class Cat extends Animal implements Pet {
    private String name;

    Cat() {
        super(4);
        name = "Stray Cat";
    }
    Cat(String _name) {
        super(4);
        name = _name;
    }
    
    public void eat() {
        System.out.println("Cat Spesific Eating nioses.");
    }
    
    public void setName(String Name) { name = Name; }
    public String getName() { return name; }
    
    public void play() {
        System.out.println("Cat rolled a ball.");
    }
}
