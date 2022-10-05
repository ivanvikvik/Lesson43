package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.FirstThread;
import by.itstep.vikvik.model.SecondThread;

import java.util.concurrent.TimeUnit;

public class SecondController {
    public static void main(String[] args) throws InterruptedException {
        SecondThread secondThread = new SecondThread();

        TimeUnit.SECONDS.sleep(2);

        secondThread.getThread().suspend();

        TimeUnit.SECONDS.sleep(2);

        secondThread.getThread().resume();

//        secondThread.getThread().destroy();
//        secondThread.getThread().stop();  // <-- it's working
//        secondThread.getThread().interrupt();

        TimeUnit.SECONDS.sleep(3);

        secondThread.stop();

        System.out.println("Main thread finished.");

//        while(true) {
//            TimeUnit.MILLISECONDS.sleep(100);
//            System.out.println("\ngetAllStackTraces: " + Thread.getAllStackTraces());
//        }



//        new FirstThread();
//        new FirstThread();
    }
}
