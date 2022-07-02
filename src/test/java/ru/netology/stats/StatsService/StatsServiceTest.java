package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18)/12;
        long actualAverageSum = service.getAverageSumSales(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }
    @Test
    public void shouldMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonthSales = 7;
        int actualMaxMonthSales = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }
    @Test
    public void shouldMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonthSales = 8;
        int actualMinMonthSales = service.getMinSales(sales);

        Assertions.assertEquals(expectedMinMonthSales, actualMinMonthSales);
    }
    @Test
    public void shouldAmountMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountMinSales = 5;
        int actualAmountMinSales = service.amountMinSales(sales);

        Assertions.assertEquals(expectedAmountMinSales, actualAmountMinSales);
    }
    @Test
    public void shouldAmountMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountMaxSales = 5;
        int actualAmountMaxSales = service.amountMinSales(sales);

        Assertions.assertEquals(expectedAmountMaxSales, actualAmountMaxSales);
    }
}


