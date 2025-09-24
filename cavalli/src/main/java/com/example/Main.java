package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cavalli c1 = new Cavalli();
        c1.setName("Cavallo 1");
        Cavalli c2 = new Cavalli();
        c2.setName("Cavallo 2");
        Cavalli c3 = new Cavalli();
        c3.setName("Cavallo 3");

        List<Cavalli> cavalli = new ArrayList<>();
        cavalli.add(c1);
        cavalli.add(c2);
        cavalli.add(c3);

        System.out.println("Gara di 100 metri");
        System.out.println("Inizio");

        
        for (Cavalli c : cavalli) {
            c.start();
        }

        
        for (Cavalli c : cavalli) {
            c.join();
        }

        cavalli.sort(Comparator.comparingLong(Cavalli::getDuration));
        
        for(int i = 0; i < cavalli.size(); i++){
            Cavalli c = cavalli.get(i);
            System.out.println((i + 1)+ "° posto: " + c.getName() + ", con tempo di: " + c.getDuration() + " ms");
        }
    }
}