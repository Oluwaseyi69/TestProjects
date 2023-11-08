package chapterSeventeen.streams;

import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(1, 2, 3, 4);
        Double result = Double.valueOf(numbers.stream()
                                .map((number)-> number+number)
                                .reduce(0, Integer::sum));
        System.out.println(result);

    }
}
