package com.company;

public class ThreadTut {
    public static void main(String[] args) {
        System.out.println("Main is starting");
    Thread thread1 = new Thread1D();
    thread1.start();
        System.out.println("Main thread is existing");
    }
}
