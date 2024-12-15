import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathTest {
    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int result = a + b;
        assertEquals("Addition test failed", 15, result);
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 5;
        int result = a - b;
        assertEquals("Subtraction test failed", 5, result);
    }
}
