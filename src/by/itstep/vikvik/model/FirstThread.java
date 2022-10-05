package by.itstep.vikvik.model;

import java.util.concurrent.TimeUnit;

public class FirstThread extends Thread {

    public FirstThread(){
        start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.printf("\n%s child thread is running...", getName());

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException exception) {
                System.err.println(exception);
            }
        }
    }
}
