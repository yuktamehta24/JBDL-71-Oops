package inheritance;

public class Dog extends Animal {

    String breed;

    public Dog() {
        System.out.println("Default Dog is created");
    }

    public Dog(String foodEaten, int noOfLegs, String breed) {
        super(foodEaten, noOfLegs);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("barking...");
    }
}
