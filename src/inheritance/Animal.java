package inheritance;

public class Animal {

    public String foodEaten; //null

    int noOfLegs = 10; //0

    private boolean isVegetarian;

    public Animal() {
        foodEaten = "def";
        System.out.println("Default Animal is created");
    }

    public Animal(String foodEaten) {
        this.foodEaten = foodEaten;
        this.isVegetarian = false;
    }


    public Animal(String foodEaten, int noOfLegs) {
        this.foodEaten = foodEaten;
        this.noOfLegs = noOfLegs;
        this.isVegetarian = false;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

}
