package abstractionViaInterface;

public class Pig implements Animal {

//    int legs = 5;

    int noOfAnimals = 3;


    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

//    @Override
//    public void sleep() {
//        Animal.super.sleep();
////        System.out.println("Pig is sleeping");
//    }



//    int legs = 5;
//    public void animalSound() {
//        System.out.println("The pig says: wee wee");
//    }
//    public void sleep() {
//        System.out.println("Zzz");
//    }
//
    static void staticMethod(){
        System.out.println("Static method in class");
    }
//
//    public void defaultMethod(){
//        System.out.println("Default method in class");
//    }

}