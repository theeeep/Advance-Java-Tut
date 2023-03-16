package com.socketProgram;
import java.net.*;
import java.io.*;
public class MyServerClient {
    public static void main(String[] args) throws Exception {
        ServerSocket servers = new ServerSocket(4444);
        Socket ss = servers.accept();
        DataInputStream din = new DataInputStream(ss.getInputStream());
        DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";

        while (!str.equals("stop")){
            str=din.readUTF();
            System.out.println("Client Says: "+str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }

        din.close();
        servers.close();
        ss.close();
    }
}
