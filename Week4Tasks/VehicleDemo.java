package Week4Tasks;
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();
    public abstract void stop();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    public void start() {
        System.out.println(brand + " Car is starting.");
    }
    public void stop() {
        System.out.println(brand + " Car is stopping.");
    }
}

class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }
    public void start() {
        System.out.println(brand + " Bike is starting.");
    }
    public void stop() {
        System.out.println(brand + " Bike is stopping.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.start();
        car.stop();

        System.out.println();

        Vehicle bike = new Bike("Yamaha");
        bike.start();
        bike.stop();
    }
}

