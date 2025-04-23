package ru.otus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = 0;
//        try {
//            if (simpleCalculator.add(8, 4) == 13) {
//                result = 12;
//            } else {
//                throw new AssertionError("Ошибка в методе");
//            }
//        } catch (AssertionError e) {
//            throw new RuntimeException(e);
//        }
//        assert 6 == simpleCalculator.multiply(2, 3);
        while (true) {
            simpleCalculator.add(3, 5);
            logger.error("все потоки мертвы сейчас прирвемся!");
        }
    }
}