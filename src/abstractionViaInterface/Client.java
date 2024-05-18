package abstractionViaInterface;

//Driver class for abstraction
public class Client {

    public static void main(String[] args) {

        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
        System.out.println(pig.legs); //5
        pig.noOfAnimals++;
        pig.staticMethod();
        Pig.staticMethod();

        Animal animal = new Pig();
        animal.animalSound();
        System.out.println(animal.legs); //4
//        animal.noOfAnimals++;
//        animal.staticMethod();
        Pig.staticMethod();

        Animal.staticMethod();


        System.out.println(pig.noOfAnimals);
        System.out.println(Animal.noOfAnimals);

        System.out.println(Animal.legs);


        Animal animal1 = new Lion();
        animal1.sleep();




        Animal animal2 = new Animal() {
            @Override
            public void animalSound() {

            }
        };

//        Pig pig = new Pig();
//        pig.defaultMethod();
//        pig.staticMethod();
//        Animal.staticMethod();
//        Pig.staticMethod();
//
//        System.out.println("Anonymous class");
//        //Anonymous class
//        Animal animalAnonymous = new Animal() {
//            @Override
//            public void animalSound() {
//
//            }
//
//            @Override
//            public void sleep() {
//
//            }
//        };
//        animalAnonymous.defaultMethod();
//
//        //Nesting demo
//        NestingDemo.InnerDemo innerDemo = new NestingDemo.InnerDemo() {
//            @Override
//            public void innerPrint() {
//
//            }
//
//            @Override
//            public void print() {
//
//            }
//        };
    }
}
