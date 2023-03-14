package com.company;

public class Main {
    public static  void main(String[] args) {
        System.out.println("Hello world!");

        Student Deep = new Student(31,"Deep",89.5f);
//        Deep.rno = 31;
//        Deep.name = "Deepak";
//        System.out.println(Deep.rno);
//        System.out.println(Deep.name);
//        System.out.println(Deep.marks);

        System.out.println(Deep);
        int a = 69;
        int b =96;

        System.out.println("Before Swap "+a+ " " +b);
        swap(a,b);


    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

//        a = a^b^(b=a);
        System.out.println("After Swap "+a+" "+b);
    }
    static class Student{
        int rno;
        String name;
        float marks ;

        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }
}