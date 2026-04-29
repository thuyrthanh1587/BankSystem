import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    // Khởi tạo Logger cho class App
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        App app = new App();
        logger.info("Ứng dụng bắt đầu khởi chạy..."); // Mức INFO

        try {
            String input = "professional logging";
            String result = app.processData(input);
            // Parameterized logging: Không dùng cộng chuỗi (+)
            logger.info("Xử lý dữ liệu thành công. Input: '{}', Output: '{}'", input, result);
        } catch (Exception e) {
            // Log lỗi kèm theo StackTrace
            logger.error("Đã xảy ra lỗi nghiêm trọng trong hàm main", e);
        }
    }

    public String processData(String input) {
        if (input == null) {
            logger.error("Dữ liệu đầu vào bị null!");
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.toUpperCase();
    }
}