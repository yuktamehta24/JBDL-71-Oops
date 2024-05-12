package polymorphism.overriding;

public class Client {

    public static void main(String[] args) {

        System.out.println("Reference variable - parent, Object - parent");
        //Reference variable - parent, Object - parent
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        vehicle.stop();
//      vehicle.crash();

        System.out.println("Reference variable - child, Object - child");
        //Reference variable - child, Object - child
        Car car = new Car();
        car.drive();
        car.stop();
        car.crash();

        System.out.println("Reference variable - parent, Object - child");
        //Reference variable - parent, Object - child
        Vehicle vehicle1 = new Car();
        vehicle1.drive(); //car is driving
        vehicle1.stop();
//      vehicle1.crash();


        Vehicle vehicleTruck = new Truck();
        vehicleTruck.drive(); //truck is driving

//      System.out.println("Reference variable - child, Object - parent");
        // Reference variable - child, Object - parent
//       Car car1 = new Vehicle();

        System.out.println("Upcasting");
        //Upcasting (already done when Reference variable - parent, Object - child)
        //Car car2 = new Car();
        Vehicle vehicle2 = (Vehicle) new Car();
        vehicle2.drive(); // car is driving
        vehicle2.stop();
//      vehicle2.crash();

        System.out.println("Downcasting");
        //Downcasting
        Vehicle vehicle3 = (Vehicle)new Car(); //upcasting
        Car car3 = (Car)vehicle3; //downcasting
        car3.drive();
        car3.stop();
        car3.crash();

        System.out.println("ClasscastException");
        //ClassCastException
        Vehicle vehicle4 = new Vehicle();
        Car car4 = (Car)vehicle4;


        Car veh = (Car) abc(new Car());
        veh.crash();

        Vehicle veh1 = abc(new Car());
//        veh1.crash();


        Car care = new Car();
        abc(care);


        Car incorrectTruck = (Car) abc(new Car());

    }

    public static Vehicle abc(Vehicle veh) {
        veh.drive();
        return veh;
    }
}
