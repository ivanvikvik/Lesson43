package by.itstep.vikvik.model;

public class Writer implements Runnable {
    //private static Object object = new Object();
    private Thread thread;
    private String text;
    private Printer printer;

    public Writer(String text, Printer printer){
        this.text = text;
        this.printer = printer;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized () {
            //...
            Printer.print(text);
        }
    }
}
