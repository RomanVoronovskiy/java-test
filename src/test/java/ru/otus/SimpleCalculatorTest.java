package ru.otus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator;

    @BeforeEach
    void setUp() {
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    void addTest() {
        //подготовка данных
        int a = 10;
        int b = 187;
        //выполнение
        int result = simpleCalculator.add(a, b);
        //сравнение  ОР и ФР
        assertEquals(197, result);
    }

    @Test
    void addFailTest() {
        int a = 10;
        int b = 187;
        simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.add(a, b);

        Assertions.assertNotEquals(196, result);
    }


    @ParameterizedTest
    @CsvSource({
            "10,3,7",
            "5,2,3",
            "100,70,30"
    })
    @DisplayName("тест проверяющий разность")
    void subtract(int a, int b, int result) {
        int actualResult = simpleCalculator.subtract(a, b);

        assertEquals(result, actualResult);
    }

    @ParameterizedTest
    @MethodSource("multiplyData")
    void multiply(int a, int b, int result) {
        assertEquals(result, simpleCalculator.multiply(a, b));
    }

    public static Stream<Arguments> multiplyData() {
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(3, 9, 27),
                Arguments.of(3, 8, 24)
        );
    }

    @Test
    void divide() {

    }
}