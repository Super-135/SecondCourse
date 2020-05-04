package com.Super135.Lesson6.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(80);
        System.out.println(server.getInetAddress());
        Socket connected = server.accept();
        DataInputStream in = new DataInputStream(connected.getInputStream());
        DataOutputStream out = new DataOutputStream(connected.getOutputStream());
        Scanner input =new Scanner(System.in);

        Thread inputService = new Thread(()->{
           while (true) {
               String command = input.nextLine();
               try {
                   out.writeUTF("Command from server: " + command);
                   out.flush();
               } catch (Exception e){
                   e.printStackTrace();
               }
           }
        });
        inputService.start();

        while (true) {
            String clientMessage = in.readUTF();
            if (clientMessage.equals("quit")) {
                System.out.println("Shut Down");
                break;
            }
            System.out.println("Message from client " + clientMessage);
            out.writeUTF("Message from server " + clientMessage);
            out.flush();
        }
    }
}
