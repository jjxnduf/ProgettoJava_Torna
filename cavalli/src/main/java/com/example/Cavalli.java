package com.example;

public class Cavalli extends Thread {

    private long startTime;
    private long endTime;

    @Override
    public void run() {
        startTime = System.currentTimeMillis(); 

        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
           
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        endTime = System.currentTimeMillis();

        System.out.println(Thread.currentThread().getName() + " Finito");
    }

    public long getDuration() {
        return endTime - startTime;
    }
}
