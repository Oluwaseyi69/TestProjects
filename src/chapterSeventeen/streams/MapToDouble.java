package chapterSeventeen.streams;

import java.util.List;

import static java.lang.System.out;

public class MapToDouble {
    public static void main(String[] args) {
        List<String> phrases = List.of(
                "abc",
                "def"
        );
        phrases.stream()
                .mapToDouble((phrase)->Double.valueOf(phrase.length()))
                .forEach(out::println);
    }
}
