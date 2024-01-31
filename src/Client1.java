import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client1{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket socket = serverSocket.accept();
        OutStream out = new OutStream(socket);
        InStream in = new InStream(socket);
        out.start();
        in.start();
    }
}
