package abstractionViaAbstractClass;

import org.w3c.dom.css.Rect;

public class Client {

    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(1);
        rectangle.draw();

        Shape shape1 = new Rectangle(1);
        shape1.area(1);

        Shape shape = new Shape(1) {
            @Override
            void area(int a) {

            }
        };
        shape.draw();
        shape.area(1);

        Shape shape2 = new Shape(4) {

            int a = 0;
            @Override
            void area(int a) {
                a = 1;
            }

            public void draw() {
                System.out.println("Drawing");
            }
        };

        shape2.area = 9;
        shape2.draw();
//        shape2.a = 0;

        shape2.draw();


//
//        Shape shape1 = new Shape() {
//            @Override
//            public void draw() {
//                super.draw();
//            }
//        };





        // Anonymous classes
//        Shape shape = new Shape() {
//            @Override
//            public void area() {
//
//            }
//
//            @Override
//            public void draw() {
//                super.draw();
//            }
//        };


        //Inner classes
        NestingDemo nestingDemo = new NestingDemo();
        nestingDemo.print();
        NestingDemo.InnerDemo innerClass = nestingDemo.new InnerDemo();
        innerClass.print();
//        innerClass.innerVar = 0;

        NestingDemo.StaticInnerDemo staticInnerClass = new NestingDemo.StaticInnerDemo();
        staticInnerClass.print();

        NestingDemo.StaticInnerDemo.staticPrint();
    }
}
