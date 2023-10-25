package joe;

public class MovingZeros {


    public int[] moveZero(int[] numbers) {
        int newNumber = 0; //[4, 3, 5, 0, 6, 9, 0, 10]
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0){
                numbers[newNumber] = numbers[i]; //[4, 3, 5, 6, 9, 10]
                newNumber++;
            }
        }
        for(int i = newNumber; i < numbers.length; i++){ //  newNumber = 5 Number.len = 7
            numbers[i] = (0); //[4, 3, 5, 6, 9, 10, 0, 0]
        }
        return  numbers;



//        int nonZeroes = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] != 0){
//                System.out.println(numbers[i]);
//                numbers[nonZeroes] = numbers[i];
//                nonZeroes++;
//            }
//        }
//
//        for(int i = nonZeroes; i < numbers.length; i++){
//
//            numbers[i] = (0);
//        }
//        return  numbers;
    }


    }

