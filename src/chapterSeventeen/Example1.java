package chapterSeventeen;

public class Example1 {
    public static void main(String[] args) {
        // the lamda expression is the impl provided for single , however a type is defined in the one abstract method
        //
        Flyable f1 = (x)-> {
            System.out.println("I am a Man");
        };
        f1.fly(9);

        Flyable f2 = (y)->{
            System.out.println("Flying fish");
        };
        f2.fly(8);

    }




}
