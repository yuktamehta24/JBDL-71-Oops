package equalsAndHashcode;

public class Client {

    public static void main(String[] args) {
        Student s1 = new Student("Yukta", 1);
        Student s2 = new Student("Yukta", 1);

        Student s3 = new Student("Yukta", 2);

//        System.out.println(s1 == s2); // false
//        System.out.println(s1.equals(s2)); // false -> true


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());

        System.out.println(s1.equals(s2));


///////

//        String a = new String("Yukta");
//        String b = new String("Yukta");

//        String c = "Yukta";
//        String d = "Yukta";

//        System.out.println(a == b); // false
//        System.out.println(a.equals(b)); // true
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

//        System.out.println(c == b); // false
//        System.out.println(c.equals(b)); // true
//
//        System.out.println(c == d); //true
    }
}
