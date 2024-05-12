package association;

public class University {

    private String universityName;

    private Department department;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public Department createDepartment(final String depName) {
        final Department dep = new Department(this, depName);
        department = dep;
        return dep;
    }

    public void destroy() {
        department = null;
    }

}
