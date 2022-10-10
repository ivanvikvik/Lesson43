package by.itstep.vikvik.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
    private static final int TIMEOUT = 10;
    private Lock lock;

    private static Random random;

    static {
        random = new Random();
    }

    public Printer(){
        lock = new ReentrantLock();
    }

    public void print(String text) {

        lock.lock();
        try {

            System.out.print("[");

            try {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(TIMEOUT));

                for (int i = 0; i < text.length(); i++) {
                    System.out.print(text.charAt(i));
                    TimeUnit.MILLISECONDS.sleep(random.nextInt(TIMEOUT));
                }

                TimeUnit.MILLISECONDS.sleep(random.nextInt(TIMEOUT));
            } catch (InterruptedException exception) {
                System.err.println(exception);
            }
            System.out.println("]");
        } finally {
             lock.unlock();
        }
    }
}
