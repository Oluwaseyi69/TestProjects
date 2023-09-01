package ArrayTest;

public class Swap {
    public static void swap(int... numbers){
     for (int counter = 0; counter < numbers.length; counter +=2){
         int temp = numbers[counter];
         numbers[counter] = numbers[counter+1];
         numbers[counter + 1] = temp;
     }

    }
    public static void swapOdd(int...numbers){
        for(int counter = 0; counter < numbers.length; counter += 2){
            if(numbers[counter] % 2 != 0 && numbers[counter + 1] %2 !=0){
                int temp = numbers[counter];
                numbers[counter] = numbers[counter+1];
                numbers[counter + 1] = temp;
            }

        }
    }
    public static void swapFirstAndLast(int... numbers){
        for(int index = 0; index < numbers.length/2; index++){
            int temp = numbers[numbers.length - 1 - index];
            numbers[numbers.length -1 - index] = numbers[index];
            numbers[index] = temp;
        }
    }

    public static void squareElements(int... numbers) {
//        int[] numbers = {4, 7, 8, 98};
        int column = 0;
        for (int index = 0; index < numbers.length; index++) {
            int numberSquare = (int) Math.pow(numbers[index], 2);
            column += (numbers[index]);
            System.out.println(numberSquare);
        }

    }
}
