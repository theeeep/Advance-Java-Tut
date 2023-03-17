package com.socketProgram;

import java.io.*;
import java.net.*;
import java.util.Date;

public class MyURLConnection {
    public static void main(String[] args) {
        try{
//            URL url  = new URL("http://www.govtenggcollegedaman.org.in/TPO_s%20Message.html");
            URL url  = new URL("https://www.google.com");
            URLConnection urlConnection = url.openConnection();
//            InputStream stream = urlConnection.getInputStream();

            System.out.println("The content of given url is:" + urlConnection.getContent());
            String ContentType = urlConnection.getContentType();
            System.out.println("The Content type is: "+ContentType);


            long date = urlConnection.getDate();
            if (date == 0){
                System.out.println("No Date Information");
            }else {
                System.out.println("Date: "+new Date(date));
            }

            long ExpiryDate = urlConnection.getExpiration();
            if (ExpiryDate == 0){
                System.out.println("No Date Information");
            }else {
                System.out.println("Expiry Date: "+new Date(ExpiryDate));
            }


//            int l;
//            while ((l=stream.read()) !=-1){
//                System.out.print((char)l);
//            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
