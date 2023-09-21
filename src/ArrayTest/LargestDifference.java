package ArrayTest;

public class LargestDifference {
    public static int largestDifference(int[] number) {
        int[] b = new int[number.length-1];
        int c = 0;
        for ( int a = 0; a < number.length-1; a++){
            c = number[a] - number[a + 1];
            b[a] = c;
        }
        int largest = b[0];
        for (int a = 0; a < b.length; a++){
            if ( b[a] > largest){
                largest = b[a];
            }

        }
        return largest;
    }
    public static int large(int... number){
        int largest = 0;
        for (int index = 0; index < number.length - 1; index++){
            int newNumber= number[index] - number[index + 1] ;
            if(newNumber > largest){
                largest = newNumber;
            }
        }
        return largest;
    }
}
