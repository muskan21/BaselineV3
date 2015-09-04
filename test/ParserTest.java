import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void isExemptedShouldReturnTrueForBook() {
        Parser parser = new Parser("1 book at 10.50");
        boolean isExempted = parser.isExemptedItem("1 book");

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnTrueForChocolate() {
        Parser parser = new Parser("1 chocolate bar at 12.89");
        boolean isExempted = parser.isExemptedItem("1 chocolate bar");

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnFalseForMusic() {
        Parser parser = new Parser("1 music cd at 12.69");
        boolean isExempted = parser.isExemptedItem("1 music cd");

        assertFalse(isExempted);
    }

    @Test
    public void isExemptedShouldReturnTrueForHealthItems() {
        Parser parser = new Parser("1 headache pill at 1.50");
        boolean isExempted = parser.isExemptedItem("1 headache pills");

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnFalseForPerfume() {
        Parser parser = new Parser("1 bottle of perfume at 45.8");
        boolean isExempted = parser.isExemptedItem("1 bottle of perfume");

        assertFalse(isExempted);
    }

    @Test
    public void isImportedShouldReturnFlaseForItemsThatAreNotImported() {
        Parser parser = new Parser("1 bottle of perfume at 45.8");
        boolean isImported = parser.isImportedItem();

        assertFalse(isImported);
    }
}
