package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.Printer;
import by.itstep.vikvik.model.Writer;


public class Controller {
    public static void main(String[] args) {
        String[] strings = {"first writer", "second writer", "third writer",
                "fourth writer", "fifth writer"};

        Printer printer = new Printer();

        for (int i = 0; i < 5; i++) {
            new Writer(strings[i], printer);
        }
    }
}
