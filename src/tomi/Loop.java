package tomi;

public class Loop {
    public static void main(String[] args) {
        loop();
    }
    public static void loop(){
        for (int index = 0; index < 10; index++){
            index += index;
            System.out.println(index);
        }
    }
}
