import org.apache.commons.lang3.StringUtils;

public class App {
    public String capitalizeString(String input) {
        if (input == null) return null;
        // Sử dụng thư viện Commons Lang3
        return StringUtils.capitalize(input);
    }
}
