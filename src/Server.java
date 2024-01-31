import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket socket1 = serverSocket.accept();
        //Socket socket2 = serverSocket.accept();
        System.out.println(socket1);
        //System.out.println(socket2);
        Scanner in1 = new Scanner(socket1.getInputStream());
        while (in1.hasNext())
            System.out.println(in1.nextLine());
    }
}