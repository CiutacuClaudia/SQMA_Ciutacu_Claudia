import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {
    @Test
    public void testContainsSubstring() {
        String mainString = "Hello, Jenkins!";
        String subString = "Jenkins";
        assertTrue("Substring test failed", mainString.contains(subString));
    }

    @Test
    public void testStartsWith() {
        String mainString = "Hello, Jenkins!";
        String prefix = "Hello";
        assertTrue("StartsWith test failed", mainString.startsWith(prefix));
    }
}
