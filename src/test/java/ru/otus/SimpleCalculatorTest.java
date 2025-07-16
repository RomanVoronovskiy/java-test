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
    SimpleCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    void addPassTest() {
        int result = calculator.add(1, 1);

        assertEquals(2, result);
    }

    @Test
    void addNullTest() {
        Integer result = null;

        Assertions.assertNull(result);
    }

    @Test
    void divideZeroExTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(100, 0),
                "Должно быть исключение деления на ноль");
    }

    @Test
    void divideZeroNotExTest() {
        Assertions.assertDoesNotThrow(() -> calculator.divide(100, 1),
                "Не должно быть исключение деления на ноль");
    }

    @CsvSource({
            "1,2,3",
            "2,4,6",
            "7,8,15"
    })
    @ParameterizedTest
    @DisplayName("Тест параметризованного сложения")
    void addTestParams(int a, int b, int expectedResult) {
        int actualResul = calculator.add(a, b);

        assertEquals(expectedResult,actualResul);
    }

    @ParameterizedTest
    @MethodSource("addTestParamsTwoData")
    void addTestParamsTwo(int a, int b, int expectedResult) {
        int actualResul = calculator.add(a, b);

        assertEquals(expectedResult,actualResul);
    }

    public static Stream<Arguments> addTestParamsTwoData() {
        return Stream.of(
             Arguments.of(2,3,5),
             Arguments.of(3,3,6),
             Arguments.of(4,3,7)
        );
    }

}