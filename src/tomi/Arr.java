package tomi;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
//        sumArr();
//        minMax();
        revers();

    }

    public static void sumArr() {
        int[] numbers = {3, 2, 5, 9, 9};
        int sum = 0;
        for (int index : numbers) {
            sum += index;
            System.out.println(sum);
        }
    }

    public static void minMax() {
        int[] numbers = {34, 56, 54, 22, 43};
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

    public static int[] revers() {
        int[] numbers = {0, 1, 2, 4, 5, 8};
        int[] newNumbers = {9, 1, 2, 7};

        int [] newArray = {numbers.length + newNumbers.length};
        int count = 0;
        for (int index = 0; index < numbers.length; index++){
            newArray = new int[]{newNumbers[index]};
            count ++;
        }
        for(int j =0; j < newNumbers.length; j++) {
            newArray = new int[]{newNumbers[j]};
            count++;
        }


        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

}