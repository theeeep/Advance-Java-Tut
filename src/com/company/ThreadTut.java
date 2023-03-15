package com.company;

public class ThreadTut {
    public static void main(String[] args) {
//        System.out.println("Main is starting");
//    Thread thread1 = new Thread1D();
//    thread1.start(); /* Extending Threads */
//
//    Thread thread2 = new Thread(new RunnableThread(),"RunThread");
//    thread2.start();


//   ----> Stack Class Called

//        StackClass stack = new StackClass(5);
//            new Thread(() ->{             /* Lambda Expression like Arrow expression in Js */
//                int counter = 0;
//                while(++counter <10)
//                    System.out.println("Pushed: "+stack.push(100) );
//                 },"Pusher").start();
//             new Thread(()->{
//                int counter = 0;
//                while (++counter<10)
//                    System.out.println("Popped: "+stack.pop());
//                 },"Popper").start();

//    ------------> Transition State of Thread
//        Thread thread3 = new Thread(()-> {
//            try{
//                Thread.sleep(1);
//                for (int i = 1000; i > 0 ; i--);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        },"States");
//
//        thread3.start();
//
//        while (true){
//            Thread.State state = thread3.getState();
//            System.out.println(state);
//            if(state == Thread.State.TERMINATED) break;
//        }
//        System.out.println("Main thread is existing");

//        -----------> DeadLock

        String lock1 = "Lock";
        String lock2 = "Lock";

        Thread thread1 = new Thread(()-> {
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("Thread 1 Lock Acquired ");
                }
            }
        },"thread1");

        Thread thread2 = new Thread(()->{
           synchronized (lock2){
               try {
                   Thread.sleep(1);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (lock1){
                   System.out.println("Thread 2 Lock Acquired ");
              }
            }
        },"thread2");

        thread1.start();
        thread2.start();

            }
        }
