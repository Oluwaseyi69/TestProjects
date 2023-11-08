package chapterSeventeen.functionaInterfaces.biConsumer;

import java.util.function.BiConsumer;

public class Example1 {
    BiConsumer<String , Integer> biConsumer = (x, y) ->{
        System.out.println(x.length() + y);
    };
//    biConsumer.accept(4,5)
}
