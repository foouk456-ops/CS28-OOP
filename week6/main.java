package week6;

public class main {


    public static void main(String[] args) {;
        System.out.println("สัตว์บก");
        Cat cat = new Cat("pat");
        cat.eat();
        cat.makeSound();
        cat.scratch();

        Dog dog = new Dog("Orange");
        dog.eat();
        dog.makeSound();
        dog.run();

        Bird bird = new Bird("fluke");
        bird.eat();
        bird.makeSound();
        bird.fly();

        System.out.println("สัตว์น้ำ");
        Fish fish = new Fish("coyo");
        fish.eat();
        fish.makeSound();
        fish.swim();

        System.out.println("สัตว์ครึ่งน้ำครึ่งบก");
        Crocodile crocodile = new Crocodile("kara");
        crocodile.eat();
        crocodile.makeSound();
        crocodile.swim();





    }

}
/*การบ้านเพิ่ม
 สัตว์น้ำ กับ สัตว์ครึ่งน้ำครึ่งบก*/ 