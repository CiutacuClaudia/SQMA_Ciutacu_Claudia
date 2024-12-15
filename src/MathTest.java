import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int result = a + b;
        assertEquals(15, result, "Addition test failed");
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 5;
        int result = a - b;
        assertEquals(5, result, "Subtraction test failed");
    }
}
