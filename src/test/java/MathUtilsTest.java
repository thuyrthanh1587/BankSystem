import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd() {
        assertEquals(5, MathUtils.add(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, MathUtils.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () ->
                MathUtils.divide(5, 0)
        );
    }
}
