package com.company;
import  java.util.*;
public class BlockingQueue {
    private Queue<Integer> q;
    private int capacity;
    public  BlockingQueue(int cap){
        q = new LinkedList<>();
        capacity = cap;
    }

//    Synchronising, wait(), wakeUp()/notify() method, try & catch
    public boolean add(int item){
        synchronized (q){
            while(q.size() == capacity)
            {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

                q.add(item);
            q.notifyAll();
            return true;
        }
    }
    public int remove(){
        synchronized (q){
            while(q.size()==0){
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
                int element  = q.poll();
            q.notifyAll();
            return element;
        }
    }


}
