package joe;

public class MovingZeros {
//    public static void main(String[] args) {
//        int [] numbers = {4, 3, 0, 2, 2};
//        moveZero(numbers);
//    }

    public int[] moveZero(int[] numbers) {
//        int newNumber = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] != 0){
//                System.out.println(numbers[i]);
//                numbers[newNumber] = numbers[i];
//                newNumber++;
//            }
//            }
//
//        for(int i = newNumber; i < numbers.length; i++){
//
//            numbers[i] = (0);
//        }
//        return  numbers;



        int nonZeroes = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0){
                System.out.println(numbers[i]);
                numbers[nonZeroes] = numbers[i];
                nonZeroes++;
            }
        }

        for(int i = nonZeroes; i < numbers.length; i++){

            numbers[i] = (0);
        }
        return  numbers;
    }


    }

