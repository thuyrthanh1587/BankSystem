import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {

    private static final Logger log = LoggerFactory.getLogger(MathUtils.class);

    public static int add(int a, int b) {
        int result = a + b;
        log.info("Add {} + {} = {}", a, b, result);
        return result;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            log.error("Divide by zero: {} / {}", a, b);
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = a / b;
        log.info("Divide {} / {} = {}", a, b, result);
        return result;
    }
}
