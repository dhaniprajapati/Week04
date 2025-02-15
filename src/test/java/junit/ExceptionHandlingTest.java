package junit;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.ExceptionHandling;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

    @Test
    void testDivideByZero() {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            exceptionHandling.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
