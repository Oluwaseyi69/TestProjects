package chapterSeventeen.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<String> phrases = List.of("abc", "def", "ghi");

        String s = phrases.stream()
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.joining("," , "(", ")"));
        System.out.println(s);
    }
}
