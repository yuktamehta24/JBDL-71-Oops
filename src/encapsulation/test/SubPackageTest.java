package encapsulation.test;

import encapsulation.Lecture;

public class SubPackageTest extends Lecture{

    public static void main(String[] args) {
        Lecture lecture = new Lecture();

        // not allowed since scope is protected
//        lecture.title = "ABC";

        SubPackageTest object = new SubPackageTest();
        // allowed since the class extends Lecture class
        object.title = "ABC";
        System.out.println("Hello");
    }
}
