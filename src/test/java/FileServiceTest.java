import org.junit.jupiter.api.Test;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileServiceTest {

    @Test
    void testCrossPlatformPath() {
        Path path = FileService.getCrossPlatformPath();

        assertEquals("data.txt", path.getFileName().toString());
    }
}