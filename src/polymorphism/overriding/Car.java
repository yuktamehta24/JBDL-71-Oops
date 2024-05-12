package polymorphism.overriding;

public class Car extends Vehicle {

//    public String model;

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    public void crash() {
        System.out.println("Car is crashing");
    }

    public void testCast(Vehicle ve) {
        Car car = (Car) ve;
    }
}
