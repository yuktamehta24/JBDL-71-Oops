import encapsulation.Lecture;


// Basics of Java
public class Main extends Lecture{

    public static void main(String[] args) {
        System.out.println("Hello world!");


        int f = 20;
        Student studentObject = new Student();

        studentObject.name = "Yukta";
        studentObject.rollNo = 1;
        studentObject.numberOfStudents = 1;

        System.out.println(studentObject.name); //Yukta
        System.out.println(studentObject.numberOfStudents); // 1
        System.out.println(Student.numberOfStudents); //1


        Student studentObject2 = new Student();

        studentObject2.name = "Ravi"; //Ravi
        studentObject2.rollNo = 2;
        studentObject2.numberOfStudents = 2;

        System.out.println(studentObject2.name); //Ravi
        System.out.println(studentObject2.numberOfStudents); // 2
        System.out.println(Student.numberOfStudents); // 2

        System.out.println(studentObject.numberOfStudents); // 2

        // String explanation
        String a = new String("Yukta");
        String b = new String("Yukta");

        String c = "Yukta";
        String d = "Yukta";

        String e = "Mehta";
        //String f = "Mehta";


    }


    public void print(){
        System.out.println("Bye");
        Lecture lecture = new Lecture();
        // Not allowed since scope is protected.
//        lecture.title = "Bye";
    }
}