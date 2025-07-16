package ru.otus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        log.info("создали калькулятор");
        double result = 0;
        try {
            if (simpleCalculator.add(8, 4) == 13) {
                result = 12;
                log.debug(result);
            } else {
                log.warn("что то отработало не так");
                throw new AssertionError("Ошибка в методе");
            }
        } catch (AssertionError e) {
            log.error("что то отработало СОВСЕМ не так!");
            throw new RuntimeException(e);
        }
        assert 6 == simpleCalculator.multiply(2, 7) : "вот тут ошибка!";
        simpleCalculator.add(3, 5);

    }
}