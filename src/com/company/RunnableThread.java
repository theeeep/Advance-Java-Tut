package com.company;

public class RunnableThread implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()+", "+i);
            
        }
    }
}
