package com.multithreading;

public class JavaMultiThread implements Runnable {
    public static void main(String[] args) {
        System.out.println("Multithreading");
        JavaMultiThread mt = new JavaMultiThread();
        Thread t = new Thread(mt);
        t.start();
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Value of i is "+i+" ->"+Thread.currentThread().getName());
            try {
                Thread.sleep(0);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }


}
