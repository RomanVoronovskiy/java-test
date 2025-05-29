package ru.otus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = 0;
        try {
            if (simpleCalculator.add(8, 4) == 13) {
                result = 12;
            } else {
                log.warn("Получили нестыковку пытаемся обработать");
                throw new AssertionError("Ошибка в методе");
            }
        } catch (AssertionError e) {
            log.error("Падаем окончательно");
            throw new RuntimeException(e);
        }
//        assert 6 == simpleCalculator.multiply(2, 7) : "вот тут ошибка!";
        simpleCalculator.add(3, 5);
        log.info("все успешно");

    }
}