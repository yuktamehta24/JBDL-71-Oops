package abstractionViaInterface;

public interface Animal {

    int legs = 4;
    int noOfAnimals = 4;


    void animalSound();

    default void sleep() {
        System.out.println("Animal is sleeping");
    }

//    int legs = 4; // by default public static final
//
//    public abstract void animalSound();
//
//    void sleep();
//
//    //From Java 8 -> default, static methods are allowed
    static void staticMethod(){
        System.out.println("Static method in interface");
    }
//
//    default void defaultMethod(){
//        System.out.println("Default method in interface");
//    }

}