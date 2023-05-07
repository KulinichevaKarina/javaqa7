package ru.netology.stats;

public class StatsService {
    public int salesAmount (int[] sales) {
        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public int averageAmount (int[] sales) {
        int average;
        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        average = amount / sales.length;

        return average;
    }

    public int maxSales (int[] sales) {
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }

        return month + 1;
    }

    public int minSales (int[] sales) {
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }

        return month + 1;
    }

    public int belowAverageAmount (int[] sales) {
        int average = this.averageAmount(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }

        return count;
    }

    public int aboveAverageAmount (int[] sales) {
        int average = this.averageAmount(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }

        return count;
    }

}

