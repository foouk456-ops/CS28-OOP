package week2;

public class Car {
    String Brand;
    int speed;

    public Car(String brand, int speed) {
    this.Brand = brand;
    this.speed = speed;

  }

    public static void main(String[] args){
        String Brand = "hanyu";
        int speed = 100;
        Car carEngineStart = new Car(Brand, speed);
        carEngineStart.carBrand();
        carEngineStart.carEngineStart();
        carEngineStart.carDriver();
        carEngineStart.carEngineStop();
        System.out.println("test ");
        
    }

    void carBrand(){
        System.out.println("Brand: " + Brand);
    }

    void carEngineStart(){
        System.out.println("Car Engine Start ......");
    }

    void carDriver(){
        System.out.println("Car Driving at speed: " + speed + " Brand: " + Brand);
    }

    void carEngineStop(){
        System.out.println("Car Engine Stop");
    }

    
}