package org.example;

import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        System.out.println(service.salesAmount(sales));
        System.out.println(service.averageAmount(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.belowAverageAmount(sales));
        System.out.println(service.aboveAverageAmount(sales));
    }
}