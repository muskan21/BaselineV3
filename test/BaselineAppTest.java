import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @SuppressWarnings("deprecation")
    @Test
    public void tokeniseInputShouldReturnTheArrayOfStringTokens() {
        BaselineApp baselineApp = new BaselineApp();
        String[] inputTokens = baselineApp.tokenise("1 book at 12.49");

        assertEquals(new String[]{"1", "book", "at", "12.49"}, inputTokens);
    }

    @Test
    public void isExemptedShouldReturnTrueForBook() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem(baselineApp.extractItem("1 book at 12.49"));

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnTrueForChocolate() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem(baselineApp.extractItem("1 chocolate bar at 42.49"));

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnFalseForMusic() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem(baselineApp.extractItem("1 Music CD at 12.49"));

        assertFalse(isExempted);
    }

    @Test
    public void isExemptedShouldReturnTrueForHealthItems() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem(baselineApp.extractItem("1 headache pill at 2.49"));

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnFalseForPerfume() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem(baselineApp.extractItem("1 bottle of perfume at 12.49"));

        assertFalse(isExempted);
    }
}
