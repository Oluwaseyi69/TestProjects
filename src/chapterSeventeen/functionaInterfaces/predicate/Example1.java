package chapterSeventeen.functionaInterfaces.predicate;

import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        Predicate<String > predicate = (word)->
                word.length() >5;

        System.out.println(predicate.test("braved"));
    }


}
