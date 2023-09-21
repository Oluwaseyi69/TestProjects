package practice;

public class Highest {

    public static int[] getHighest(int[] numbers, int value){
        int[] arr = numbers;
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int index = 0; index < arr.length; index++) {
                if (value == numbers[counter] + arr[index])  {
                    return new int[]{index, counter};
                }
            }
        }

        return null;
    }
}




