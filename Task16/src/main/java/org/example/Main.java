package org.example;

public class Main {
    public static void main(String[] args) {
        Philosoph[] phil = new Philosoph[5];
        Object[] forks = new Object[5];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }
        for (int i = 0; i < phil.length; i++) {
            Object lFork = forks[i];
            Object rFork = forks[(i + 1) % 5];
            if (i == phil.length - 1){
                phil[i] = new Philosoph(rFork,lFork);
            }
            else{
                phil[i] = new Philosoph(lFork, rFork);
            }
            Thread t = new Thread(phil[i], "Философ " + (i+1));
            t.start();
        }
    }
}