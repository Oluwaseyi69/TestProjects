package Snacks_16_07;

public class NewString {
    public String name(String name){
        String[] newName = name.split(" ", 3);
        String name1 = "";
        String newName1 = "";

        for (int i = 0; i < newName.length -1; i++) {
            name1 = newName[i];
            newName1 += name1.charAt(0)  + "." +" ";
        }

        return newName1 + newName[newName.length-1]  ;
    }


}
