package by.itstep.vikvik.model;

import java.util.concurrent.TimeUnit;

public class SecondThread implements Runnable {

    private Thread thread;
    private boolean running;

    public SecondThread(){
        thread = new Thread(this);
        running = true;
        thread.start();
    }

    @Override
    public void run() {
        while (running) {
            System.out.printf("\n%s child thread is running...", thread.getName());

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException exception) {
                System.err.println(exception);
            }
        }

        //...
    }

    public Thread getThread() {
        return thread;
    }

    public void stop(){
        running = false;
    }
}

