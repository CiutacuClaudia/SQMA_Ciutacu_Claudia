import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void testContainsSubstring() {
        String mainString = "Hello, Jenkins!";
        String subString = "Jenkins";
        assertTrue(mainString.contains(subString), "Substring test failed");
    }

    @Test
    public void testStartsWith() {
        String mainString = "Hello, Jenkins!";
        String prefix = "Hello";
        assertTrue(mainString.startsWith(prefix), "StartsWith test failed");
    }
}
