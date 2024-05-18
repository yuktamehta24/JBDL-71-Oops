package abstractionViaAbstractClass;

public abstract class Shape {

    protected int area;

    private int sides;

    public Shape(int area) {
        this.area = area;
    }


    abstract void area(int a);

    protected void draw() {
        System.out.println("Drawing shape");
        sides = 8;
    }
}
