import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    // ❌ Version lỗi (hardcode Windows path)
    public static File getWindowsFile() {
        return new File("C:\\temp\\data.txt");
    }

    // ✅ Version đúng (cross-platform)
    public static Path getCrossPlatformPath() {
        return Paths.get("temp", "data.txt");
    }
}
