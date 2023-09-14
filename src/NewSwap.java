public class NewSwap {
    

    public static boolean swapping(int... numbers){
        return true;
    }


    public int[] swapped(int firstNumber, int secondNumber, int[] numbers ) {
        numbers[firstNumber]+=numbers[secondNumber];
        numbers[secondNumber] = numbers[firstNumber] - numbers[secondNumber];
        numbers[firstNumber] = numbers[firstNumber] - numbers[secondNumber];


        return numbers;
    }
}
