import java.io.Closeable;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        try(MyResource resource = new MyResource()) {

        }
    }
}

class MyResource implements Closeable {


    @Override
    public void close() {

    }
}
