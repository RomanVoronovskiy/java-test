package ru.otus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.debug("Тут текст что мы попали в метод");
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = 0;
        try {
            if (simpleCalculator.add(8, 4) == 13) {
                result = 12;
            } else {
                throw new AssertionError("Ошибка в методе");
            }
        } catch (AssertionError e) {
            LOGGER.error("Ошибка! {}",e.getMessage());
        }
        LOGGER.info("Мы расчитали результат = {}",result);

        assert 6 == simpleCalculator.multiply(2, 3);
        LOGGER.debug("Тут текст что мы вышли");
    }
}