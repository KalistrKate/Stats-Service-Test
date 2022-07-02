package ru.netology.stats.StatsService;

public class StatsService {
    public int getSumSales(long[] sales) {
        int sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    public int getAverageSumSales(long[] sales) {
        return getSumSales(sales) / sales.length;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int getMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public int amountMinSales(long[] sales) {
        long avg = getAverageSumSales(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale < avg) {
               amount++;
            }
        }
        return amount;
    }
    public int amountMaxSales(long[] sales) {
        long avg = getAverageSumSales(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale > avg) {
                amount++;
            }
        }
        return amount;
    }
}
