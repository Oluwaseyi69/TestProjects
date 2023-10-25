package joe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    public void testThatStringIs_A_palindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.palindrome("madam"));
    }

    @Test
    public void testThatStringIs_notA_palindrome() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.palindrome("mada"));
    }
}