package chapterSeventeen.streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);
        Set<Integer> nums = Set.of(100,200, 300);

        Map<String, String> map = Map.of(
                "John", "Doe",
                "Seyi", "Banwo"
        );
        System.out.println(numbers);
        System.out.println(nums);
        System.out.println(map);

        Stream<Integer> s1 = numbers.stream();// finite stream
        Stream<Integer> s2 = Stream.of(1, 2, 3, 4); //finite stream
        Stream<Integer>s3 = Stream.generate(()-> new Random().nextInt())
                .limit(10); // infinite stream

        s3.forEach((element)-> System.out.println(element));
        IntStream s4 = Arrays.stream(new int[] {10, 20, 30});// primitive stream
    }
}
