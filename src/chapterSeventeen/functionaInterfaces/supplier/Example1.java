package chapterSeventeen.functionaInterfaces.supplier;

import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->
             "Y'hello";
        ;
        String result = supplier.get();
        System.out.println(result);

        Supplier<String> supply = ()-> {
            return "Y'hello";
        };
        String result1 = supply.get();
        System.out.println(result1);
    }
}
