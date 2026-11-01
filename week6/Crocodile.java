package week6;

public class Crocodile extends Animal implements Swimming, Fix {

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " say : roar: Roar! Roar!");
    }

    @Override
    public void swim() {
        System.out.println(name + " it is swimming ");
    }

    @Override
    public void hori() {
        System.out.println(name + " is a semi-aquatic animal");
    }
    
    
}
