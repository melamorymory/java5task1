package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200,300,3","400,600,5","1000,5000,39"})
    void shouldCountingNumbers(int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.counting(lowerLimit, upperLimit);
        assertEquals(actual, expected);
    }
}