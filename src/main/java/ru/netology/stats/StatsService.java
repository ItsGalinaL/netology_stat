package ru.netology.stats;

public class StatsService {

    public long totalSum(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum = totalSum + sale;
        }
        return totalSum;
    }

    public long avgSum(long[] sales) {
        long avgSum = 0;
        for (long sale : sales) {
            avgSum = avgSum + sale;
        }
        return avgSum / sales.length;
    }

    public int maxSale(long[] sales) {
        int monthNum = 0;
        long maxSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                monthNum = i;
            }
        }
        return monthNum + 1;
    }

    public int minSale(long[] sales) {
        int monthNum = 0;
        long minSale = Long.MAX_VALUE;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSale) {
                minSale = sales[i];
                monthNum = i;
            }
        }
        return monthNum + 1;
    }

    public int belowAvgSales(long[] sales) {
        long avgSum = avgSum(sales);
        int monthCount = 0;

        for (long sale : sales) {
            if (sale < avgSum) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int aboveAvgSales(long[] sales) {
        long avgSum = avgSum(sales);
        int monthCount = 0;

        for (long sale : sales) {
            if (sale > avgSum) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }
}
