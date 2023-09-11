package Snacks_16_07;


public class LargestElement {
    public static void main(String[] args) {
        LargestElement largestElement = new LargestElement();
        largestElement.getLargestElement(new int[]{7, 9, 98, 65});
        System.out.println(largestElement);
    }




    public int getLargestElement;
    public static int [] numbers;
    public int element;


    public int getLargestElement(int [] numbers) {
        if(numbers.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        int largestElement = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largestElement){
                largestElement = numbers[i];
            }
        }
        return largestElement;
    }

}