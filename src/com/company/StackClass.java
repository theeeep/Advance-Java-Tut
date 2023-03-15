package com.company;

import java.util.*;
import java.lang.reflect.Array;


//Concurrency in Thread
public class StackClass {
    private  int[] array;
    private int stackTop;
    Object lock;
    public  StackClass(int Capacity){
        array = new int[Capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean push(int elemeent){
        synchronized (lock){
            if(isFull())
                return false;
            ++stackTop;

            try{
                Thread.sleep(1000);
            }catch (Exception e){}

            array[stackTop] = elemeent;
            return true;
        }
    }

    public int pop(){
      synchronized (lock){
          if(isEmpty()) return  Integer.MIN_VALUE;
          int obj = array[stackTop];
          array[stackTop] = Integer.MIN_VALUE;
          try {
              Thread.sleep(1000);
          } catch (Exception e){}
          stackTop--;
          return  obj;
      }
    }
    public boolean isEmpty(){
        return stackTop <0;
    } public boolean isFull(){
        return stackTop >=array.length-1;
    }

    public static void main(String[] args) {
        System.out.println("Main is starting");
    }
}
