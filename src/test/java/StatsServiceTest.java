import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void salesAmountTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        Assertions.assertEquals(service.salesAmount(sales), 180);
    }

    @Test
    public void averageAmountTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        Assertions.assertEquals(service.averageAmount(sales), 15);
    }

    @Test
    public void maxSalesTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        Assertions.assertEquals(service.maxSales(sales), 8);
    }

    @Test
    public void minSalesTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        Assertions.assertEquals(service.minSales(sales), 9);
    }

    @Test
    public void belowAverageAmountTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        Assertions.assertEquals(service.belowAverageAmount(sales), 5);
    }

    @Test
    public void aboveAverageAmountTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        Assertions.assertEquals(service.aboveAverageAmount(sales), 5);
    }


}
