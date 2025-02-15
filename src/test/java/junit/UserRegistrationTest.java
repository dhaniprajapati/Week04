package junit;
import com.junit.UserRegistration;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private UserRegistration userRegistration;
    @BeforeEach
    public void setUp() {
        userRegistration = new UserRegistration();
    }
    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("DhaniPrajapati", "miracle0312@gmail.com", "prajapatidh098"));
    }

    @Test
    public void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("", "miracle0312@gmail.com", "prajapatidh098");
        });
        assertEquals("Invalid username", exception.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("DhaniPrajapati", "miracle0312@gmailcom", "prajapatidh098");
        });
        assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    public void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("DhaniPrajapati", "miracle0312@gmail.com", "pass");
        });
        assertEquals("Invalid password", exception.getMessage());
    }
}
