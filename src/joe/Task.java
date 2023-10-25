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
        int newNumber = 0;
        for (int i = 0; i <number.length; i++) {
            if(number[i] != 0){
                number[newNumber] = number[i];
                newNumber++;
            }
        }
        for (int i = newNumber; i < number.length; i++) {
            number[i] = 0;
        }

        return number;
    }
}
