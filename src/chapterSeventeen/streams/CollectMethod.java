package chapterSeventeen.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String[] args) {
        List<String>phrases = List.of(
                "abc", "def", "def"
        );
        Set<String>strings = phrases.stream()
                                    .map((element)->element)
                                    .collect(Collectors.toSet());

        System.out.println(strings);

    }
}
