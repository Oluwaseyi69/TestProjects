package New;

import java.util.ArrayList;
import java.util.List;

public class UndoStringBuilder {
    StringBuilder stringBuilder = new StringBuilder();

    List<StringBuilder>word = new ArrayList<>();

    public StringBuilder append(String str){
        word.add(new StringBuilder(stringBuilder.toString()));

        return stringBuilder.append(str);
    }
    public StringBuilder reverse(){
        word.add(new StringBuilder(stringBuilder.toString()));
        return stringBuilder.reverse();
    }
    public String toString(){
        return stringBuilder.toString();
    }
    public StringBuilder replace(int start, int end, String str){
        word.add(new StringBuilder(stringBuilder.toString()));
        if(start >= 0 && start < stringBuilder.length() && end > start && end<= stringBuilder.length()){
            stringBuilder.replace(start, end, str);
            return stringBuilder;
        }
        else {
            return new StringBuilder("Invalid indices");
        }
    }
    public StringBuilder undo(){
        if(!word.isEmpty())
            return word.remove(word.size()-1);
        else {
            return stringBuilder;
        }
    }
}
