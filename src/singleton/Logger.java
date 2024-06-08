package singleton;

public final class Logger {

// early initialization
//    private static Logger logger = new Logger();  //early
    private static Logger logger;  //lazy

    private Logger() {
        //
    }

//    public static Logger getLoggerInstance() {
//        return logger;
//    }

    // lazy initialization

//    public synchronized static Logger getLoggerInstance() {
//        if (logger == null) {
//            System.out.println("Logger is getting initialised");
//            logger = new Logger();
//        }
//        return logger;
//    }

//    public static Logger getLoggerInstance() {
//        if (logger == null) {
//            System.out.println("Logger is getting initialised");
//            synchronized (Logger.class) {
//                logger = new Logger();
//            }
//        }
//        return logger;
//    }

    public static Logger getLoggerInstance() {
        if (logger == null) {
            System.out.println("Logger is getting initialised");
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void writeToLogs(String s) {
        System.out.println(this + s);
    }
}
