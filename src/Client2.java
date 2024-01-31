import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8081);
        OutStream out = new OutStream(socket);
        InStream in = new InStream(socket);
        out.start();
        in.start();
    }
}
