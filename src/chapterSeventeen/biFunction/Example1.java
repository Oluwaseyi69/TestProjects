package chapterSeventeen.biFunction;

import java.util.function.BiFunction;

public class Example1 {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction = (word, number)->
             word.length() == number;
             boolean result = biFunction.apply("Hello", 5);
            System.out.println(result);

    }
}
