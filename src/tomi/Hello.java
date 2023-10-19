package tomi;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        hello();
    }
    public static void hello(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        if(name.matches("[Aa-zZ]+")){
            System.out.println(name);

        }    else {
            hello();
        }


    }
}
