package joe;

public class Task {

    public String newTask(String word, int[] newWord){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < newWord.length; i++) {
            result.append(word.charAt(newWord[i]));
        }
        return result.toString();
    }

    public int[] zeroIndex(int[] number) {
//        int[] answer = new int[]{0};
//        int[] newAnswer = new int[]{0};
        int[] result = new int[9];
        for (int index = 0; index < number.length; index++) {
            if (number[index] == 0){
                int temp = number[index];
                number[index] = number[index+1];
                number[index+1] = temp;
                System.out.println(temp);
            }

//            else {
//                newAnswer = new int[]{number[index]};
//                System.out.println(Arrays.toString(newAnswer));
//            }
//            for (int j = 0; j < answer.length; j++) {
//
//            }
//            result = new int[]{answer + newAnswer};
//            System.out.println(Arrays.toString(result));


        }
        return new int[]{result[0]};
    }
}
