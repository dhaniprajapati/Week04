package junit;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.StringsUtilityMethod;
import org.junit.jupiter.api.Test;

public class StringUtilityMethodTest {
    @Test
    public void testReverse() {
        assertEquals("dcba",StringsUtilityMethod.reverse("abcd"));
        assertEquals("racecar", StringsUtilityMethod.reverse("racecar"));
        assertEquals("",StringsUtilityMethod.reverse(""));
        assertNull(StringsUtilityMethod.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringsUtilityMethod.isPalindrome("racecar"));
        assertTrue(StringsUtilityMethod.isPalindrome("madam"));
        assertFalse(StringsUtilityMethod.isPalindrome("hello"));
        assertFalse(StringsUtilityMethod.isPalindrome(null));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO",StringsUtilityMethod.toUpperCase("hello"));
        assertEquals("WORLD",StringsUtilityMethod.toUpperCase("world"));
        assertEquals("",StringsUtilityMethod.toUpperCase(""));
        assertNull(StringsUtilityMethod.toUpperCase(null));
    }
}