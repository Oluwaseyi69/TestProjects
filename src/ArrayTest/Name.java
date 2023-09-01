package ArrayTest;

import java.util.Scanner;


public class Name {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a name");
    String name = scan.next();
    if(name.matches("^\\^ +$*A-Z")){System.out.println(name);
    }
    else{
        String s = "Invalid input";

    }
}}