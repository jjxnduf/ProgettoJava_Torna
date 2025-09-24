package com.example;

public class Cavalli extends Thread {

    private long startTime;
    private long endTime;

    @Override
    public void run() {
        startTime = System.currentTimeMillis(); 

        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        endTime = System.currentTimeMillis();
    }

    public long getDuration() {
        return endTime - startTime;
    }
}
