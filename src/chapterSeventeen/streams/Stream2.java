package chapterSeventeen.streams;

import java.util.stream.IntStream;

public class   Stream2 {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 10);
        stream.filter((number)->number %2 ==0)
                .forEach((number)-> System.out.println(number));
    }
}
