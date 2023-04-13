package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    void testTotalSum() {
        long[] sales = new long[]{10, 10, 45, 60, 2342, 23, 54, 6767, 66, 5, 1, 555};

        long totalSumExpected = 9938;
        long totalSumActual = new StatsService().totalSum(sales);

        Assertions.assertEquals(totalSumExpected, totalSumActual);
    }

    @Test
    void testAvgSum() {
        long[] sales = new long[]{10, 10, 45, 60, 2342, 23, 54, 6767, 66, 5, 1, 555};

        long avgSumExpected = 828;
        long avgSumActual = new StatsService().avgSum(sales);

        Assertions.assertEquals(avgSumExpected, avgSumActual);
    }

    @Test
    void testMaxSale() {
        long[] sales = new long[]{10, 10, 45, 60, 2342, 23, 54, 6767, 66, 5, 1, 555};

        int maxSaleExpected = 8;
        int maxSaleActual = new StatsService().maxSale(sales);

        Assertions.assertEquals(maxSaleExpected, maxSaleActual);
    }

    @Test
    void testMinSale() {
        long[] sales = new long[]{10, 10, 45, 60, 2342, 23, 54, 6767, 66, 5, 1, 555};

        int minSaleExpected = 11;
        int minSaleActual = new StatsService().minSale(sales);

        Assertions.assertEquals(minSaleExpected, minSaleActual);
    }

    @Test
    void testBelowAvgSales() {
        long[] sales = new long[]{10, 10, 45, 60, 2342, 23, 54, 6767, 66, 5, 1, 555};

        int belowAvgExpected = 10;
        int belowAvgActual = new StatsService().belowAvgSales(sales);

        Assertions.assertEquals(belowAvgExpected, belowAvgActual);
    }

    @Test
    void testAboveAvgSales() {
        long[] sales = new long[]{10, 10, 45, 60, 2342, 23, 54, 6767, 66, 5, 1, 555};

        int aboveAvgExpected = 2;
        int aboveAvgActual = new StatsService().aboveAvgSales(sales);

        Assertions.assertEquals(aboveAvgExpected, aboveAvgActual);
    }
}