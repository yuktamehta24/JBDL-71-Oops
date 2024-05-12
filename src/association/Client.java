package association;

//Driver class for association
public class Client {

    public static void main(String[] args) {

        // Department should exist with the university -> Composition
        University university = new University("IIT");
        Department department = university.createDepartment("CSE");

        // Professor can have its own identity as well -> Aggregation
        Professor professor = new Professor("Ram Kumar");

        department.assign(professor);


//        Department department1 = new Department();

    }
}
