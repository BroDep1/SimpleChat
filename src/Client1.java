import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println("hello world");
    }
}
