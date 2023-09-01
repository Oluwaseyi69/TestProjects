package ChapterSix;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println(getname());

    }
//    public static void sayHi(){
//        System.out.println("Hello");
//    }
//    public static void sayHi(String name){
//        System.out.println("Hi"+" "+ name);
//    }
    public static boolean getname() {
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String names = scan.next();
        if (names.matches("^[0-9]+$")){
            System.out.println("Your name is "+ names);
        }
        else {
            getname();
        }
        return true;
    }
}
