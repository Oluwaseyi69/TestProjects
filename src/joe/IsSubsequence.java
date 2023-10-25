package joe;

public class IsSubsequence {
//    public static void main(String[] args) {
//        IsSubsequence isSubsequence = new IsSubsequence();
////        isSubsequence.isSubsequence("ace", "abcde");
////        isSubsequence.subsequence("ace", "abcde");
//        isSubsequence.isSubset("ace", "abcde");
//
//    }

//    public boolean subsequence(String s, String t) {
//
//        boolean word = Boolean.parseBoolean((String) t.subSequence(0, 4));
//        System.out.println(word);
//
//        return word;
//    }

    public boolean isSubsequence(String s, String t) {
        String newWord;
        int count = 0;
        int countS = 0;
        while (count < s.length() &&  countS < t.length()) {
            if (s.charAt(count) == t.charAt(countS)){

                count++;
        }
            countS++;
        }

        return count == s.length();
    }

}


