package chapterSeventeen.functionaInterfaces;

import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number)->{
            getSquareOfNumber(number);
        };
        consumer.accept(4);
    }

    private static void getSquareOfNumber(int number){
        System.out.println(number * number);
    }
}
