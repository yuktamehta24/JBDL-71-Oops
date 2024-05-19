package singleton;

public class Client {

    public static void main(String[] args) {
        Logger l1 = Logger.getLoggerInstance();
        System.out.println(l1.hashCode());

        l1.writeToLogs("Hello");

        Logger l2 = Logger.getLoggerInstance();
        System.out.println(l2.hashCode());
        l2.writeToLogs("Bye");

        Logger l3 = Logger.getLoggerInstance();
        System.out.println(l3.hashCode());

        Logger l4 = Logger.getLoggerInstance();
        System.out.println(l4.hashCode());

        Logger l5 = Logger.getLoggerInstance();
        System.out.println(l5.hashCode());


//        Logger l1 = Logger.getLoggerInstance();
//        System.out.println(l1.hashCode());
//
//        Logger l2 = Logger.getLoggerInstance();
//        System.out.println(l2.hashCode());
//
//        Logger l3 = Logger.getLoggerInstance();
//        System.out.println(l3.hashCode());
//
//        Logger l4 = Logger.getLoggerInstance();
//        System.out.println(l4.hashCode());
//
//        Logger l5 = Logger.getLoggerInstance();
//        System.out.println(l5.hashCode());

    }
}
