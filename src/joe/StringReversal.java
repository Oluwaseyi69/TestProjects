package joe;

public class StringReversal {
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();

        int length = charArray.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "A better place";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }


}
