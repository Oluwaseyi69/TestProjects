package chapterSeventeen.functionaInterfaces;

import java.util.LinkedList;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        java.util.function.Consumer<Integer> consumer = (number)->{
            System.out.println(number);
        };
        numbers.forEach(consumer);

        consumer.accept(4);
    }

    private static void getSquareOfNumber(int number){
        System.out.println(number * number);
    }
}
