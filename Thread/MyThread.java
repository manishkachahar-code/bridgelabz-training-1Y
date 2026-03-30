package com.gla.Thread;

public class MyThread implements Runnable{
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("Number : "+i);
        }

    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
// t1.start();
        Thread tt1= new Thread(t1);
        tt1.start();

    }
}