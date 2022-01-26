package ru.netology.stats;

public class StatsService {
    int[] sales = {};

    public int calcSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
            //sum+=sale; таже запись иначе
        }
        return sum;
    }

    public int calcAverageSales(int[] sales) {
        return calcSumSales(sales) / sales.length;
            }

    public int maxSalesInMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesInMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calcMonthsSalesLessAverage(int[] sales) {
        int countMonth = 0;
        int i = calcAverageSales(sales);
        for (int sale : sales) {
            if (sale < i) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

    public int calcMonthsSalesMoreAverage(int[] sales) {
        int countMonth = 0;
        int i = calcAverageSales(sales);
        for (int sale : sales) {
            if (sale > i) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

}
