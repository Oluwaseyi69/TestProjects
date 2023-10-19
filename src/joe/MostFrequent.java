package joe;

public class MostFrequent {
    public int frequent(int[] numbers){
        int count = 0;
        int highcount = 0;
        int newHighCount = 0;
        for (int index = 0; index < numbers.length; index++) {
            for (int idx = 0; idx < numbers.length; idx++) {
                if(numbers[index] == numbers[idx]){
                    count++;
                }
            }
            if (count > highcount){
                highcount = count;
                newHighCount = numbers[index];
            }
        }
        return newHighCount;

    }


}
