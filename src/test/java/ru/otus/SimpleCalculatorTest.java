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

class SimpleCalculatorTest {

    private SimpleCalculator calc;

    @BeforeEach
    public void setUp() {
        calc = new SimpleCalculator();
    }

    @Test
    public void testAdd() {
        int result = calc.add(1, 1);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void testAddFalse() {
        int result = calc.add(3, 5);

        Assertions.assertFalse(result == 7);
    }

//    @Test
//    public void testAddFail(){
//        Assertions.fail("Данные некорректы!");
//    }

    @Test
    public void testAddEq() {
        Assertions.assertEquals(5, calc.add(3, 2));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(1, calc.subtract(2, 1));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(1, calc.multiply(1, 1));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2, calc.divide(2, 1));
    }

    @Test
    public void testDivideThrows() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.divide(3, 0);
        }, "Должно выброситься исключение при делении на ноль");
    }

    @Test
    public void testDivideDoesNotThrows() {
        Assertions.assertDoesNotThrow(() -> {
            calc.divide(3, 1);
        }, "Не должно выброситься исключение !");
    }

    @CsvSource({
            "1, 1, 2",
            "2, 2, 4",
            "3, 3, 6",
            "4, 4, 8"
    })
    @ParameterizedTest
    public void testAddOne(int a, int b, int result) {
        Assertions.assertEquals(result, calc.add(a, b));
    }

    @ParameterizedTest
    @MethodSource("testData")
    public void testAddTwo(int a, int b, int result) {
        Assertions.assertEquals(result, calc.add(a, b));
    }

    @MethodSource
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 3, 5)
        );
    }

}