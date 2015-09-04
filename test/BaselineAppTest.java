import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BaselineAppTest {

    @Test
    public void isExemptedShouldReturnTrueForBook() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem("1 book");

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnTrueForChocolate() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem("1 chocolate bar");

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnFalseForMusic() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem("1 music cd");

        assertFalse(isExempted);
    }

    @Test
    public void isExemptedShouldReturnTrueForHealthItems() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem("1 headache pills");

        assertTrue(isExempted);
    }

    @Test
    public void isExemptedShouldReturnFalseForPerfume() {
        BaselineApp baselineApp = new BaselineApp();
        boolean isExempted = baselineApp.isExemptedItem("1 bottle of perfume");

        assertFalse(isExempted);
    }
}
