import org.apache.commons.lang3.StringUtils;

/**
 * Lớp App để minh họa Checkstyle và Logic.
 * (Google Checks yêu cầu có Javadoc cho public class).
 */
public class App {

    // LỖI CỐ Ý ĐỂ BOT REVIEW: Tên biến sai chuẩn (phải là camelCase), thiếu private/public
    int my_bad_variable = 10;

    /**
     * Phương thức viết hoa chữ cái đầu.
     */
    public String capitalizeString(String input) {
        if (input == null) {
            return null;
        }
        // Sử dụng thư viện từ bài 6
        return StringUtils.capitalize(input);
    }

    public void hello() {
        // LỖI CỐ Ý: Thụt lề sai (Google check yêu cầu 2 hoặc 4 spaces đồng nhất)
        System.out.println("Hello World");
    }
}