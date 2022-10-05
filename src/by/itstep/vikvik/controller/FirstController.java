package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.FirstThread;

import java.util.concurrent.TimeUnit;

public class FirstController {
    public static void main(String[] args) throws InterruptedException {


        new FirstThread();
        new FirstThread();
        new FirstThread();
        new FirstThread();
        new FirstThread();

        while(true) {
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println("\ngetAllStackTraces: " + Thread.getAllStackTraces());
        }



//        new FirstThread();
//        new FirstThread();
    }
}
