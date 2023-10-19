package ArrayTest;

public class RemoveElement {
    private int[] newCounter;
    public int[] remove(int... numbers) {
        int evenCount = 0;

        // Count the number of even numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        // Create a new array to store the even numbers
        int[] evenNumbers = new int[evenCount];
        int evenIndex = 0;

        // Populate the evenNumbers array with even elements
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenIndex] = number;
                evenIndex++;
            }
        }

        return evenNumbers;
    }

}
