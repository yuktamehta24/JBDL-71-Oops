package abstractionViaAbstractClass;

public class NestingDemo {
    int a = 0;
    int b = 0;
    int c = 9;

    public void print() {
        System.out.println("NestingDemo");
        InnerDemo i = new InnerDemo();
        i.innerVar = 30;

        a = i.innerVar;

        StaticInnerDemo staticInnerDemo = new StaticInnerDemo();
        StaticInnerDemo.staticinnerVariable = 80;

        staticInnerDemo.staticinnerVar = 30;
    }

    class InnerDemo {
        private int innerVar = 20;
        public void print() {
            System.out.println("InnerDemo");
            a = 10;
            b = 19;

            NestingDemo N =new NestingDemo();
            N.b = 10;
            N.a = 10;

//            NestingDemo.a = 02;
        }
    }

    static class StaticInnerDemo {

        private int staticinnerVar = 20;
        private static int staticinnerVariable = 20;
        public void print() {
            System.out.println("StaticInnerDemo");
//            a = 10;
//            b = 20;

            NestingDemo N = new NestingDemo();
            N.c = 8;
            N.b = 10;
        }

        public static void staticPrint() {
            System.out.println("StaticInnerDemo.staticPrint()");
        }
    }
}
