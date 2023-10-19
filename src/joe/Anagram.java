package joe;

import java.util.Arrays;

public class Anagram {

    public boolean word(String word, String newWord) {
        boolean isAnagram ;

        char[] word1 = word.toCharArray();
        char[] word2 = newWord.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        word = new String (word1);
        newWord = new String(word2);

        isAnagram = word.equalsIgnoreCase(newWord);

        return isAnagram;
    }

    public void anagramCheck(String word){
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (char) temp;
                }
            } for (int j = 0; j< arr.length; j++){
                System.out.println(arr[j]);
            }

        }
    }

    public boolean anagram(String word, String newWord){
        if(!(word.length() == newWord.length())){
            return false;
        }
        return false;
    }
}
