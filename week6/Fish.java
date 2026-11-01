package week6;

public class Fish extends Animal {
    
    public Fish(String name) {
        super(name);
    }
     public void eat() {
        System.out.println(name + " is eating.");
    }
     @Override
     public void makeSound(){}


     public void swim(){
        System.out.println(name + " it is swimming ");
     }

}
