package inheritance;

public class Cat extends Animal {

   String foodEaten = "abc"; //null
//
//    int noOfLegs; //0
//
    String family;

    public Cat() {
        System.out.println("Default Cat is created");
    }

    public Cat(String foodEaten, int noOfLegs, String fam) {
        super(foodEaten, noOfLegs); //parameterized
//        super(); //default
        this.family = fam;
        System.out.println("this: "+ foodEaten);
        System.out.println("super: "+ super.foodEaten);
        super.foodEaten = "abc";
//        this.foodEaten = super.foodEaten;
//        family = family;
    }

    public void makeNoise() {
        System.out.println("Meow");
    }
}
