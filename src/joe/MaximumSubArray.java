package joe;

public class MaximumSubArray {
    //    public static void main(String[] args) {
//        MaximumSubArray maximumSubArray = new MaximumSubArray();
//        int[] x = {2, 4, 6, 3, 9, 1};
//        System.out.println(Arrays.toString(maximumSubArray.maximum(x)));
//    }
    public int[] maximum(int y, int... number) {
        int largest = 0;
        int highestSum = 0;
        int idx;
        for (idx = 0; idx < y; idx++) {
            highestSum = highestSum + number[idx];
            if (highestSum > largest) {
                largest = highestSum;

            }
            System.out.println(largest);

        }
        return new int[idx];
    }
}