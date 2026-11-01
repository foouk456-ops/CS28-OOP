package week6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    //@Override
    public void makeSound() {
        System.out.println(name + " say : barks: Woof! Woof!");
    }

    public void run() {
        System.out.println(name + " is running on all fours");
    }
}
