import org.apache.commons.lang3.StringUtils;

/**
 * Lớp chính của ứng dụng.
 */
public class App {

    /**
     * Điểm bắt đầu của chương trình khi chạy file JAR.
     */
    public static void main(String[] args) {
        App app = new App();
        String input = "hello maven world";
        String result = app.capitalizeString(input);

        System.out.println("---------------------------------------");
        System.out.println("Ứng dụng đã khởi chạy thành công!");
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
        System.out.println("---------------------------------------");
    }

    /**
     * Viết hoa chữ cái đầu tiên của chuỗi.
     */
    public String capitalizeString(String input) {
        if (input == null) {
            return null;
        }
        // Sử dụng thư viện Apache Commons Lang3
        return StringUtils.capitalize(input);
    }
}