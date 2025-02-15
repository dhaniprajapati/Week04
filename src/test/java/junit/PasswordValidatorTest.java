package junit;
import com.junit.PasswordValidator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    private PasswordValidator passwordValidator;
    @BeforeEach
    public void setUp() {
        passwordValidator = new PasswordValidator();
    }
    @Test
    public void testValidPassword() {
        assertTrue(passwordValidator.validate("Prajapatidhani06"));
    }
    @Test
    public void testInvalidPasswordShort() {
        assertFalse(passwordValidator.validate("Pass1"));
    }
    @Test
    public void testInvalidPasswordNoUppercase() {
        assertFalse(passwordValidator.validate("prajapatidhani"));
    }
    @Test
    public void testInvalidPasswordNoDigit() {
        assertFalse(passwordValidator.validate("PASSWORD"));
    }
    @Test
    public void testNullPassword() {
        assertFalse(passwordValidator.validate(null));
    }
}
