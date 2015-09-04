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
}
