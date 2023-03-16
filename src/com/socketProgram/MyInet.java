package com.socketProgram;

import java.io.*;
import java.net.*;
import java.util.Arrays;

public class MyInet {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.govtenggcollegedaman.org.in");

            System.out.println("ip: "+ip);
            System.out.println("Address: "+ Arrays.toString(ip.getAddress()));

            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("Host Address: "+ip.getHostAddress());
            System.out.println("Hash Code: "+ip.hashCode());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
