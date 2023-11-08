package Streams.Input;

import java.io.InputStreamReader;

import static java.lang.System.in;

public class BufferedReader {
    public static void main(String[] args) {
//        char[] data = new char[1000];
        try(var inputStreamReader = new InputStreamReader(in);
                java.io.BufferedReader reader = new java.io.BufferedReader(inputStreamReader)){
            System.out.println("Enter anything: ");
           String data = reader.readLine();
            System.out.println("You've entered: "+ data);
        }catch(Exception exception){
            System.err.println(exception.getMessage());

        }
    }
}
