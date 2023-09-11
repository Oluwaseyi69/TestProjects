package ArrayTest;

public class RemoveElement {
    private int[] newCounter;

    public static void remove(int... numbers) {

        int index = 0;
//        int counter = 0;
        int[] newNumber = new int[]{0};
//        int[] newNumbers = new int[index];
        for (index = 0; index < numbers.length ; index++) {
            if (numbers[index] % 2 != 0) {
                System.out.println(numbers[index]);
                newNumber = new int[]{numbers[index - 2]};
                System.out.println(newNumber);

            }
        }
    }
//    public static void minus(int... numbers){
//        int index = 0;
//        int newNumber = new int [];
//        int counter = 0;
//        int length = numbers.length;
//        int newArray = 0;
//        for (int newCounter = 0; newCounter < length; newCounter++) {
//            if (numbers[newCounter] % 2 != 0) {
//                numbers[index] = newNumber;
//                newNumber= numbers[newCounter];
//                counter++;
//
//
////                System.out.println(numbers[newCounter]-2);
//
//            }
//        }
//    }
}
