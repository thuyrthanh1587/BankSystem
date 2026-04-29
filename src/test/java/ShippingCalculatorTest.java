import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    ShippingCalculator calc = new ShippingCalculator();

    @Test
    void testStandard() {
        // 5 * 3000 = 15000
        assertEquals(15000.0, calc.calculate(5, "STANDARD"));
    }

    @Test
    void testExpress() {
        // 5 * 5000 + 20000 = 45000
        assertEquals(45000.0, calc.calculate(5, "EXPRESS"));
    }

    @Test
    void testInvalidWeight() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculate(-1, "STANDARD"));
    }
}