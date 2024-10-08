package ru.netology.services.FreelanceWeekend.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class FreelanceWeekendTest {
    @Test
    public void testFreelanceWeekend1() {
        FreelanceWeekend service = new FreelanceWeekend();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFreelanceWeekend2() {
        FreelanceWeekend service = new FreelanceWeekend();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    public void testFreelanceWeekendParam1(int income, int expenses, int threshold, int expected) {
        FreelanceWeekend service = new FreelanceWeekend();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testdata.csv")
    public void testFreelanceWeekendParam2(int income, int expenses, int threshold, int expected) {
        FreelanceWeekend service = new FreelanceWeekend();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}