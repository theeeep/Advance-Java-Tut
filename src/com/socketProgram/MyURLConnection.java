package com.socketProgram;

import java.io.*;
import java.net.*;
public class MyURLConnection {
    public static void main(String[] args) {
        try{
            URL url  = new URL("http://www.govtenggcollegedaman.org.in/TPO_s%20Message.html");
            URLConnection urlConnection = url.openConnection();
            InputStream stream = urlConnection.getInputStream();
            int l;
            while ((l=stream.read()) !=-1){
                System.out.print((char)l);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
