package ru.otus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleCalculator {

    private static final Logger logger = LogManager.getLogger(SimpleCalculator.class.getName());

    public int add(int a, int b) {
        logger.info("Мы начали выполнять сложение между {} и {}", a, new Cat());
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
