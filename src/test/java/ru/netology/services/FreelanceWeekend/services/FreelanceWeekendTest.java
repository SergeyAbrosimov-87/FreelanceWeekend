package ru.netology.services.FreelanceWeekend.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class FreelanceWeekendTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testdata.csv")
    public void testCashFreelanceWeekend(int expected, int income, int expenses, int threshold) {
        FreelanceWeekend service = new FreelanceWeekend();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}