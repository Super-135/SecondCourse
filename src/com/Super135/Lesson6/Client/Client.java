package com.Super135.Lesson6.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("Localhost",80);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        Thread inputService1 = new Thread(()->{
            while (true) {
                try {
                    String message = in.readUTF();
                    System.out.println("Message from client " + message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        inputService1.start();
        Scanner input = new Scanner(System.in);
        while (true) {
            String message = input.nextLine();
            if (message.equals("quit")) {
                System.out.println("Finished");
                out.writeUTF(message);
                out.flush();
                break;
            }
            out.writeUTF(message);
            out.flush();
//            String messageFromServer = in.readUTF();
//            System.out.println(messageFromServer);
        }
    }
}
