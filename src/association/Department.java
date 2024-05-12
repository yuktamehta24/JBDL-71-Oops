package association;

public class Department {

    private final String name;
    private Professor professor;

//    private final University university;

    public Department(University university, String name) {
        this.name = name;
        //this.university = university;
    }

    public Department() {
        name = "test";
    }


    public void assign(Professor p) {
        System.out.println("Professor assigning " + p.getName());
        professor = p;
    }

    public void fire(Professor p) {
        System.out.println("Professor firing " + p.getName());
        professor = null;
    }
}
