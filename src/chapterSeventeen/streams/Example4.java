package chapterSeventeen.streams;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        numbers.stream()
                .forEach((number) -> System.out.println("number:" + number));
    }
}
