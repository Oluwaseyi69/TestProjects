package tomi;

public class Narray {
    public static void main(String[] args) {
        arr();
    }
    public static void arr(){
        int[] number = {4, 5, 6, 7, 8, 9};
        for (int index = number.length - 1; index > 0; index--){
            System.out.println(number[index]);
        }
    }
}
