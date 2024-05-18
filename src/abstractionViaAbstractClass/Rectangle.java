package abstractionViaAbstractClass;

public class Rectangle extends Shape {
    public Rectangle(int area) {
        super(area);
    }

//    Rectangle() {
//        super(12);
//    }

    @Override
    public void area(int a) {
        System.out.println("Area of rectangle");
        area = 12;
        area++;
        draw();
    }
//
//    public void draw() {
//        System.out.println("Drawing shape for rectangle");
//    }
}
