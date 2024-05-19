package exceptionHandling;

import java.io.Closeable;

public class CustomResource implements AutoCloseable {

    int g = 10;

    CustomResource() {
        System.out.println("Customresource created");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Custom resource closed");
    }
}
