package com.socketProgram;
import java.io.*;
import java.net.*;
public class MyHttpUrlConnection {
    public static void main(String[] args) {
        try{
            URL url =  new URL("http://www.govtenggcollegedaman.org.in/TPO_s%20Message.html");
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            for (int i = 1; i <=9 ; i++) {
                System.out.println(huc.getHeaderFieldKey(i)+" - "+huc.getHeaderField(i));
            }
            huc.disconnect();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
