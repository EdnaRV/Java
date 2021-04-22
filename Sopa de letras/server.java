package me.mpj;

import java.io.*;
import java.net.*;

public class Main implements Runnable {

    private final Socket socket;

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8000);
        while(true) {
            Socket socket = serverSocket.accept();
            Thread t = new Thread(new Main(socket));
            t.start();
        }

    }


    public Main(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            System.out.println("Running");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream printStream = null;

            printStream = new PrintStream(socket.getOutputStream());

        while(true) {
            String res = reader.readLine();
            System.out.println("Read line");
            System.out.println(res);
            printStream.print("got it!");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}