package week6;

public class Bird extends Animal{


    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " say : chirps: Chirp! Chirp!");
    }

    //Fly
    public void fly() {
        System.out.println(name + " is flying");
    }
    
    
}
