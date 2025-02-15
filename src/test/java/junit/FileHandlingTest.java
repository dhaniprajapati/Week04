package junit;
import com.junit.FileHandling;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileHandlingTest {

    private static final String TEST_FILE = "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day05\\src\\main\\java\\com\\junit\\text.txt";
    private FileHandling fileProcessor;

    @BeforeEach
    public void setUp() {
        fileProcessor = new FileHandling();
    }

    @AfterEach
    public void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testWriteToFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(TEST_FILE, content);

        File file = new File(TEST_FILE);
        assertTrue(file.exists());
    }

    @Test
    public void testReadFromFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(TEST_FILE, content);

        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    public void testIOExceptionHandling() {
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day05\\src\\main\\java\\com\\junit\\text.txt");
        });
    }
}
