import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class OutStream extends Thread{
    Socket socket;
    PrintStream out;
    OutStream(Socket socket) throws IOException {
        this.socket = socket;
        this.out = new PrintStream(socket.getOutputStream());
    }
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            out.println(sc.nextLine());
        }
    }

}
