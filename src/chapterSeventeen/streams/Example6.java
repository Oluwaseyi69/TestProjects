package chapterSeventeen.streams;

import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<String> phrases = List.of(
                "QWERTY",
                "ASDFG",
                "ZXCVB"
        );
        phrases.stream()
                .filter((phrase)-> phrase.length() == 5)
                .filter((phrase)-> phrase.startsWith("Z"))
                .forEach((phrase)-> System.out.println("phrase:" + phrase));
    }
}
