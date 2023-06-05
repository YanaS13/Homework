package org.example;

public class Philosoph implements Runnable {
    private Object lFork;
    private Object rFork;
    public Philosoph(Object lFork, Object rFork){
        this.lFork = lFork;
        this.rFork = rFork;
    }

    @Override
    public void run() {
        try {
            for (; ; ) {
                System.out.println(Thread.currentThread().getName() + " размышляет");
                Thread.sleep(1000);
                synchronized (lFork) {
                    System.out.println(Thread.currentThread().getName() + " взял левую вилку");
                    Thread.sleep(1000);
                    synchronized (rFork) {
                        System.out.println(Thread.currentThread().getName() + " взял правую вилку");
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " кушает");
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " кладет правую вилку");
                        Thread.sleep(1000);
                    }
                    System.out.println(Thread.currentThread().getName() + " кладет левую вилку и снова размышляет");
                    Thread.sleep(1000);

                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}