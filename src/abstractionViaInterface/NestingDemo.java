package abstractionViaInterface;

public interface NestingDemo {

    void print();

    interface InnerDemo extends NestingDemo {
        void innerPrint();
    }

}

