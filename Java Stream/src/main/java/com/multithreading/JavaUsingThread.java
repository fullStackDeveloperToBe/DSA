package com.multithreading;

public class JavaUsingThread extends Thread {
    public static void main(String[] args) {
        System.out.println("Multithreading using Thread class");
        JavaUsingThread t = new JavaUsingThread();
        t.start();
    }
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Value of i is "+i+" ->"+Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
