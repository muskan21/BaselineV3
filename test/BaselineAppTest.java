import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaselineAppTest {

    @Test
    public void extractItemShouldReturnTheNameOfTheItemInTheInput() {
        BaselineApp baselineApp = new BaselineApp();
        String itemName = baselineApp.extractItem("1 book at 12.49");

        assertEquals("book ", itemName);
    }

    @Test
    public void extractItemShouldReturnTheNameOfTheImportedItemInTheInput() {
        BaselineApp baselineApp = new BaselineApp();
        String itemName = baselineApp.extractItem("1 imported box of chocolates at 10.00");

        assertEquals("imported box of chocolates ", itemName);
    }

    @Test
    public void extractPriceShouldReturnThePriceOfTheInputItem() {
        BaselineApp baselineApp = new BaselineApp();
        double itemPrice = baselineApp.extractPrice("1 book at 12.49");

        assertEquals(12.49, itemPrice, 0.01);
    }
}
