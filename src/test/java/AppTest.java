import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testProcessDataSuccess() {
        App app = new App();
        assertEquals("HELLO", app.processData("hello"));
    }

    @Test
    void testProcessDataError() {
        App app = new App();
        // Test này sẽ kích hoạt dòng logger.error trong App.java
        assertThrows(IllegalArgumentException.class, () -> app.processData(null));
    }
}