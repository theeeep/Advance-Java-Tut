package  com.company;

class MyThread1 extends Thread{


    public  MyThread1(String name){
        super(name);
    }

    @Override
    public  void run(){
        int i = 0;
      while ( i <99){
          System.out.println("Thread "+this.getId()+" "+this.getName()+i);
          try{
              Thread.sleep(500);
          } catch (InterruptedException e){
              e.printStackTrace();
          }
          i++;
      }
//       while (true){
//           System.out.println("My Thread1 is Running");
//           System.out.println("Cooking....");
//       }
    }
}
class MyThread2 extends Thread{
    @Override
    public  void run(){
        int i = 0;
       while (i<55){
           System.out.println("My Thread2 is Running");
           System.out.println("Singing...");
           i++;
       }
    }
}
public class Thread1 {
    public static void main(String[] args) {
//    MyThread1 t1 = new MyThread1();
    MyThread1 t1 = new MyThread1("Deep");
    MyThread1 t2 = new MyThread1("Anirudh");
    MyThread1 t3 = new MyThread1("Ludwig");
    MyThread1 t4 = new MyThread1("Ryaan");
    MyThread2 t5= new MyThread2();
//    MyThread2 t2 = new MyThread2();
  t4.setPriority(Thread.MAX_PRIORITY);
  t1.setPriority(Thread.MIN_PRIORITY);
    t1.start();
//    try{
//        t1.join();
//    }
//    catch (Exception e){
//        System.out.println(e);
//    }
    t5.start();

//    t2.start();
//    t3.start();
//    t4.start();
//        System.out.println("The id of the thread t1 is " + t1.getId());
//        System.out.println("The id of the thread t1 is " + t1.getName());
//    t2.start();
    }
}
