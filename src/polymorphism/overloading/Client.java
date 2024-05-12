package polymorphism.overloading;

public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee("Yukta", 1, 20);

        employee.work();
        employee.work("Coding");
        employee.work("Coding", 12);


        String a = employee.work();
        String res = employee.work();

    }
}
