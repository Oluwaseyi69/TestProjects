package joe;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PatternStringTest {
    @Test
    public void testForPatternString(){
        PatternString patternString = new PatternString();
        assertTrue(patternString.hasRepeatedSubstring("abab"));
    }

    @Test
    public void testForPatternStringReturnFalse(){
        PatternString patternString = new PatternString();
        assertFalse(patternString.hasRepeatedSubstring("aba"));
    }
}