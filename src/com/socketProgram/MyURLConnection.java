package com.socketProgram;


import java.net.*;
import java.util.Date;

public class MyURLConnection {
    public static void main(String[] args) {
        try{
            URL url  = new URL("https://www.google.com");
            URLConnection urlConnection = url.openConnection();

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
                System.out.println("No Expiry Date Information");
            }else {
                System.out.println("Expiry Date: "+new Date(ExpiryDate));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
