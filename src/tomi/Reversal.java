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




    public char[] reverse(String sentence){
        char[] resultSentence = sentence.toCharArray();
        for (int i = resultSentence.length-1; i > 0 ; i++) {

            System.out.println(resultSentence);
        }
        return resultSentence;
    }
}







