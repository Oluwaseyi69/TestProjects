package joe;

public class HashChecker {
    public static void main(String[] args) {
        HashChecker hashChecker = new HashChecker();
        String a = "ab#c";
        String b = "ad#c";
        System.out.println(hashChecker.hashCheck(a, b));

//        String x = "wor%ds be l%ike ";
//        System.out.println(hashChecker.replaceModulus(x));
    };

    public String deleteStringBeforeHash(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '#') {
                newWord = word
                        .replace(word.charAt(i), ' ')
                        .replace(word.charAt(i - 1), ' ');
            }
            break;
        }
        if (newWord.contains("#")){
            newWord = deleteStringBeforeHash(newWord);
        }
        return newWord;
    }

    public boolean hashCheck(String x, String y){
        boolean result;
        x = deleteStringBeforeHash(x).replace(" ", "");
        y = deleteStringBeforeHash(y).replace(" ", "");

        result = x.equals(y);
        System.out.println(result);
        return result;
    }

    public String replaceModulus(String word) {
//        String newWord = "";
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == '%') {
//                newWord = word.replace("%", ".    ")
//                        .replace("&", " ");
//                System.out.println(newWord);
//                break;
//            }
//        }
        String newWord = word.replace("&", " ").replace("%", ".    ");
        return newWord;
    }


}
