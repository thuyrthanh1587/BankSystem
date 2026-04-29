import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testCapitalize() {
        App app = new App();
        assertEquals("Hello", app.capitalizeString("hello"));
        assertEquals(null, app.capitalizeString(null));
    }
}