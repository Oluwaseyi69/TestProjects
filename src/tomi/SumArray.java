package tomi;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
//        SumArray sumArray = new SumArray();
//        int[] number = {2, 3, 4, 5};
//        SumArray.addArray(number);
//        SumArray.swapArray(number);
//        adding();
//        addedAverage();
//        even();
        evenNumber();

    }

    public static int[] addArray(int[] number) {
        int sum = 0;
        for (int index = 0; index < number.length; index++) {
            sum += number[index];
            System.out.println(sum);

        }
        return new int[]{sum};
    }

    public static int[] swapArray(int[] number) {
        int num1 = 0;
        int num2 = 0;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(temp);
        return new int[]{temp};
    }

    public static void adding() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your score:");
            int score = scan.nextInt();
            sum += score;
        }
        System.out.println(sum);
    }

    public static void addedAverage() {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your score:");
            int score = scan.nextInt();
            sum += score;
            average = sum / score;

        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }

    public static void even() {
        int scores = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your score:");
            int score = scan.nextInt();
            if (score %2 == 0) {
                sum+=score;
            }
        }
        System.out.println(sum);
    }

    public static void evenNumber() {
        int scores = 0;
        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your score:");
            int score = scan.nextInt();
            if (score % 2 == 0) {
                scores = score;
            }
        }
        System.out.println(scores);
    }
}
