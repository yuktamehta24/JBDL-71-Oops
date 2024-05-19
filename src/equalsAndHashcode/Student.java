package equalsAndHashcode;

public class Student {

    String name;

    Integer rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object s) {
        if (this == s) {
            return true; // comparing with same object
        }
        if (!(s instanceof Student)) {
            return false; // incompatible types
        }

        Student student = (Student) s;
        if (this.name.equals((student.name)) && (this.rollNo == student.rollNo)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
//
//        int a = 10;
//        if (name == "Yukta") {
//            a = 20;
//        }
//
//        return a+ rollNo;


        return this.name.hashCode() + this.rollNo.hashCode();
        // logic -> if name is same, and if roll no is same
    }

}
