package tomi;

import java.util.ArrayList;

public class Reversal {

    public ArrayList<Integer> isReversed(int[] num1, int[] num2){
        ArrayList<Integer>linkedList = new ArrayList<>();
        for (int index = num1.length-1; index >=0; index--){
            linkedList.add(num1[index]);
        }
        for (int col = num2.length-1; col >= 0; col--){
            linkedList.add(num2[col]);
        }
        return linkedList;
    }
//    public ArrayList
//
//    int[] isReversed(int[] number1, int [] number2) {
////        int[] array1 = {1, 2, 3};
////        int[] array2 = {4, 5, 6};
//
//    }
}


//
//    int totalLength = number1.length + number2.length;
//
//    int[] newArray = new int[totalLength];
//
//        for (int i = 0; i < number2.length; i++) {
//        newArray[i] = number2[number2.length - 1 - i];
//        }
//
//        for (int i = 0; i < number1.length; i++) {
//        newArray[number2.length + i] = number1[number1.length - 1 - i];
//        }
//
//        for (int element : newArray) {
//        System.out.print(element);
//        }
//



