package joe;
//
public class PatternString {
//    public boolean pattern(){
//        return true;
//    }
//}

    public boolean hasRepeatedSubstring(String input) {
        int n = input.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = input.substring(0, i);
                StringBuilder repeated = new StringBuilder();
                int repetitions = n / i;
                for (int j = 0; j < repetitions; j++) {
                    repeated.append(substring);
                }
                if (input.equals(repeated.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        String input1 = "abab";
//        String input2 = "aba";
//
//        boolean hasRepeatedSubstring1 = hasRepeatedSubstring(input1);
//        boolean hasRepeatedSubstring2 = hasRepeatedSubstring(input2);
//
//        System.out.println("Input: '" + input1 + "', Output: " + hasRepeatedSubstring1);
//        System.out.println("Input: '" + input2 + "', Output: " + hasRepeatedSubstring2);
//    }

}