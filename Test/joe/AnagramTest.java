package joe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void testThatTheWordIsAnAnagram(){
        Anagram anagram = new Anagram();
        String word = "anagram";
        String newWord = "nagaram";
        boolean isAnagram =anagram.word(word, newWord);

        assertTrue(isAnagram);
    }

    @Test
    public void testThatAWordCanBeAnAnagram(){
        Anagram anagram = new Anagram();
        anagram.anagram("anagram", "nagaram");
    }

}