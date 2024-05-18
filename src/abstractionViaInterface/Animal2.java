package abstractionViaInterface;

public interface Animal2 {

    void animalSound();

    default void sleep() {
        System.out.println("Animal2 is sleeping");
    }

//    public abstract void animalSound();
//
//    default void defaultMethod(){
//        System.out.println("Default method in interface");
//    }
//
//    static void staticMethod(){
//        System.out.println("Static method in interface");
//    }
}
