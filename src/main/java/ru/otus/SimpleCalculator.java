package ru.otus;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleCalculator {

    public static final Logger log = LogManager.getLogger(SimpleCalculator.class.getName());

    public int add(int a, int b) {
        log.info("Выполняем сложение между {} и {} ", a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
