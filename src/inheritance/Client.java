package inheritance;

//Driver class for Inheritance
public class Client {

    public static void main(String[] args) {
        //base class Animal
        System.out.println("ANIMAL");
        Animal animal = new Animal("default food", 2);
        animal.eat();
//        animal.isVegetarian = true;
       //animal.makeNoise();

        //Dog class
        System.out.println("DOG");
        Dog dog = new Dog("dog food", 4, "bulldog");
        dog.eat(); // animal
        dog.bark(); // dog

        //Cat class
        System.out.println("CAT");
        Cat cat = new Cat("cat food", 4, "felidae");
        cat.eat(); // animal
//        cat.isVegetarian;
        cat.makeNoise(); // cat

        Animal animal1 = new Cat("cat food", 4, "felidae");
        System.out.println(animal1.foodEaten); //def

        // super constructor
        Cat cat1 = new Cat();

        Cat cat4 = new Cat();
        System.out.println(cat4.foodEaten);

        Animal animal4 = new Cat();
        System.out.println(animal4.foodEaten); //def

        Cat cat5 = (Cat) animal;
        System.out.println(cat5.foodEaten);

    }

}
