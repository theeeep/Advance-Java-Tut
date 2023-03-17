package com.socketProgram;

import java.io.*;
import java.net.*;
import java.util.Arrays;

public class MyInet {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.govtenggcollegedaman.org.in");

            System.out.println("Host Name with Ip Address: "+address);
            System.out.println("Address: "+ Arrays.toString(address.getAddress()));

            System.out.println("Host Name: "+address.getHostName());
            System.out.println("Host Address: "+address.getHostAddress());
            System.out.println("Hash Code: "+address.hashCode());


            InetAddress adress2[] = InetAddress.getAllByName("www.govtenggcollegedaman.org.in");
            for (int i = 0; i < adress2.length; i++) {
                System.out.println(adress2[i]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
