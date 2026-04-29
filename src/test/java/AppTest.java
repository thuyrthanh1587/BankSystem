import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for App.
 * Google Checkstyle yêu cầu Javadoc cho các class public.
 */
public class AppTest {

    /**
     * Test case cho phương thức capitalizeString.
     */
    @Test
    public void testCapitalize() {
        App app = new App();

        // Kiểm tra trường hợp thông thường
        assertEquals("Hello", app.capitalizeString("hello"));

        // Kiểm tra trường hợp input là null
        assertEquals(null, app.capitalizeString(null));

        // Kiểm tra trường hợp chuỗi rỗng
        assertEquals("", app.capitalizeString(""));
    }
}