import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class InStream extends Thread{
    Socket socket;
    Scanner in;

    InStream(Socket socket) throws IOException {
        this.socket = socket;
        this.in = new Scanner(socket.getInputStream());
    }
    @Override
    public void run(){
        while (in.hasNext()) {
            System.out.println(in.nextLine());
        }
    }

}
