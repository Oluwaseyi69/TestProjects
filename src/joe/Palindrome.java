package joe;

public class Palindrome {
    public boolean palindrome(String word){
        char[] charArray = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            if (charArray[i] != charArray[word.length() -1 - i]){
//                System.out.println("Not a palindrome");
                return false;
            }
        }

//        System.out.println("palindrome");;
        return true;
    }
}
