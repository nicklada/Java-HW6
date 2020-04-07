package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @ParameterizedTest (name = "{0}")
    @CsvSource(
            value = {
            "'calculateSum'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18], 180 ",
    },
            delimiter = ',')

    public void shouldCalculateSum(String testName, int[] sales, int expected) {
        StatsService service = new StatsService();
        //вызываем целевой метод:
        int actual = service.calculateSum(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @ParameterizedTest (name = "{1}")
        @CsvSource(value = {
                "'calculateAverage'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18], 15 ",
        },
                delimiter = ',')

        public void shouldCalculateAverage(String testName, int[] sales, int expected) {
            StatsService service = new StatsService();
            //вызываем целевой метод:
            int actual = service.calculateAverage(sales);
            //производим проверку(сравниваем ожидаемый и фактический):
            assertEquals(expected, actual);
        }
    @ParameterizedTest (name = "{2}")
    @CsvSource(value = {
            "'calculateMaxMonth'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18], 6 ",
    },
            delimiter = ',')

    public void shouldCalculateMax(String testName, int[] sales, int expected) {
        StatsService service = new StatsService();
        //вызываем целевой метод:
        int actual = service.findMax(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @ParameterizedTest (name = "{3}")
    @CsvSource(value = {
            "'calculateMinMonth'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18], 9 ",
    },
            delimiter = ',')

    public void shouldCalculateMin(String testName, int[] sales, int expected) {
        StatsService service = new StatsService();
        //вызываем целевой метод:
        int actual = service.findMin(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @ParameterizedTest (name = "{4}")
    @CsvSource(value = {
            "'calculateMinMonth'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18], 5 ",
    },
            delimiter = ',')

    public void shouldCalculateMoreAverage(String testName, int[] sales, int expected) {
        StatsService service = new StatsService();
        //вызываем целевой метод:
        int actual = service.moreAverage(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @ParameterizedTest (name = "{5}")
    @CsvSource(value = {
            "'calculateMinMonth'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18], 5 ",
    },
            delimiter = ',')

    public void shouldCalculateLessAverage(String testName, int[] sales, int expected) {
        StatsService service = new StatsService();
        //вызываем целевой метод:
        int actual = service.lessAverage(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
