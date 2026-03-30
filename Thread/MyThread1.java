package com.gla.Thread;

public class MyThread1 implements Runnable{

        public void run(){
            for (int i=1; i<=10; i++){
                System.out.println("Number : "+i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error Occured .");
                }
            }

        }

        public static void main(String[] args) {
            MyThread t1=new MyThread();
            Thread tt1= new Thread(t1);
            tt1.start();

        }
    }

