package by.itstep.vikvik.model;

import java.util.concurrent.TimeUnit;

public class Writer implements Runnable {
    //private static Object object = new Object();
    private Thread thread;
    private String text;
    private Printer printer;

    public Writer(String text, Printer printer) {
        this.text = text;
        this.printer = printer;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            printer.getSemaphore().acquire();
            printer.print(text);
        }catch(InterruptedException exception){
            System.out.println(exception);
        }finally {
            printer.getSemaphore().release();
        }

    }
}
