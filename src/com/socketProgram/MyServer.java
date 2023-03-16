package com.socketProgram;
import java.io.*;
import java.net.*;


public class MyServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(6666);
            Socket s =  server.accept(); // Establish Connection
            DataInputStream dis  = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("Message: "+str);
            server.close();

        }catch(Exception e){
            System.out.println(e);
    }
    }
}
