package by.itstep.vikvik.model;

public class Writer implements Runnable {
    //private static Object object = new Object();
    private Thread thread;
    private String text;

    public Writer(String text){
        this.text = text;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (Printer.class) {
            //...
            Printer.print(text);
        }
    }
}
