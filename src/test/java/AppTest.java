import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * Kiểm thử đơn vị cho lớp App.
 */
public class AppTest {

    @Test
    public void testCapitalizeString_Normal() {
        App app = new App();
        assertEquals("Hello", app.capitalizeString("hello"));
    }

    @Test
    public void testCapitalizeString_Null() {
        App app = new App();
        assertNull(app.capitalizeString(null));
    }

    @Test
    public void testCapitalizeString_Empty() {
        App app = new App();
        assertEquals("", app.capitalizeString(""));
    }
}