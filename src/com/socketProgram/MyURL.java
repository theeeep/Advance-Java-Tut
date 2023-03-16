package com.socketProgram;

import java.net.*;

public class MyURL {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.govtenggcollegedaman.org.in/");
            System.out.println("Protocol: " +url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("Default Port No: "+url.getDefaultPort());
            System.out.println("Path: " +url.getPath());
            System.out.println("File: "+url.getFile());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
