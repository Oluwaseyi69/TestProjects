package joe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsSubsequenceTest {

    @Test
    public void testToCheckForSubSequence() {
        IsSubsequence isSubsequence = new IsSubsequence();
        assertFalse(isSubsequence.isSubsequence("met", "stream"));
    }

    @Test
    public void testToCheckForIsSubSequence() {
        IsSubsequence isSubsequence = new IsSubsequence();
        assertTrue(isSubsequence.isSubsequence("ace", "abcde"));
    }
}