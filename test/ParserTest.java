import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {
    @Test
    public void extractItemShouldReturnTheNameOfTheItemInTheInput() {
        Parser parser = new Parser("1 book at 12.49");
        String itemName = parser.extractItem();

        assertEquals("1 book ", itemName);
    }

    @Test
    public void extractItemShouldReturnTheNameOfTheImportedItemInTheInput() {
        Parser parser = new Parser("1 imported bottle of perfume at 45.89");
        String itemName = parser.extractItem();

        assertEquals("1 imported bottle of perfume ", itemName);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void tokeniseInputShouldReturnTheArrayOfStringTokens() {
        Parser parser = new Parser("1 book at 12.49");
        String[] inputTokens = parser.tokenise();

        assertEquals(new String[]{"1", "book", "at", "12.49"}, inputTokens);
    }

    @Test
    public void extractPriceShouldReturnThePriceOfTheInputItem() {
        Parser parser = new Parser("1 book at 12.49");
        double itemPrice = parser.extractPrice();

        assertEquals(12.49, itemPrice, 0.01);
    }
}
