package encapsulation;

import java.util.Date;

//Driver class for encapsulation
public class Client {

    public static void main(String[] args) {

        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture("Java", "Jagrati", new Date(), "Inprogress");
        Lecture lecture4 = new Lecture("Java", "Jagrati", new Date(), "Inprogress");

        System.out.println(lecture2.equals(lecture4));

        Lecture lecture3 = new Lecture("Java-OOPS");

        lecture1.setMentor("Yukta");
        lecture1.setTitle("Java OOPS");
        lecture1.title = "ABC";

        System.out.println(lecture1.getTitle());

        //not allowed since access is private
//        lecture1.mentor = "Yukta Mehta";

        //allowed since scope is protected
        lecture1.title = "Java OOPS";

//        lecture1.title = "ASDFVGHNJKIJUHYTGFRDES";


        lecture2.setMentor("Yukta");
        lecture2.setTitle("Java OOPS");

        lecture2.setTitle("ASDFVGHNJKIJUHYTGFRDES");

        // not allowed since scope is private
//        lecture2.setStatus("Completed");

    }
}
