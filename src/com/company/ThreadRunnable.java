package com.company;


class MyThreads1 implements Runnable{
    public  void run(){
        System.out.println("I am Thread 1 :)");
        System.out.println("I am Thread 1 :)");
        System.out.println("I am Thread 1 :)");
        System.out.println("I am Thread 1 :)");
        System.out.println("I am Thread 1 :)");
        System.out.println("I am Thread 1 :)");
        System.out.println("I am Thread 1 :)");
        System.out.println("I am Thread 1 :)");
    }
}
class MyThreads2 implements Runnable{
    public  void run(){
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
        System.out.println("I am Thread 2 :)");
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {

        MyThreads1 Music = new MyThreads1();
        Thread classical = new Thread(Music);
        MyThreads2 Dance= new MyThreads2();
        Thread salsa = new Thread(Dance);
       classical.start();
        salsa.start();

    }
}
