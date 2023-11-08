package chapterSeventeen.binaryOperator;

import java.util.function.BinaryOperator;

public class Example1 {
    public static void main(String[] args) {
       BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 + num2;

        System.out.println(binaryOperator.apply(4, 4));
    }
}
