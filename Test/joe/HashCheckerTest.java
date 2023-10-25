package joe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashCheckerTest {
    @Test
    public void testToReplaceModulusWithSpace(){
        HashChecker hashChecker = new HashChecker();
        String actual = hashChecker.replaceModulus("wo%rd&be&lik%e&bomb%");
        String expected = ("wo.    rd be lik.    e bomb.    ");
        assertEquals(actual, expected);
    }
    @Test
    public void testToReplaceHashAndCheck(){
        HashChecker hashChecker = new HashChecker();
        String x = "a#b#d#pqrs#";
        String y = "ac#d##pqr";

        assertTrue(hashChecker.hashCheck(x, y));
    }
    @Test
    public void testToReplaceHash(){
        HashChecker hashChecker = new HashChecker();
        String x = "chr###chr#";
        String y = "chr";

        assertTrue(hashChecker.hashCheck(x, y));
    }

}