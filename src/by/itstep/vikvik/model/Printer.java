package by.itstep.vikvik.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Printer {
    private static final int TIMEOUT = 200;

    private static Random random;

    static {
        random = new Random();
    }

    public static void print(String text) {

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
    }
}
