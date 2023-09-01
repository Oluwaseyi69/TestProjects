package DataStructures;

public class ListArray {
    private int[] elements;
    private int size;
    private boolean isEmpty;
    private int element;

    public ListArray(){
        final int INITIAL_CAPACITY = 10;
        elements = new int[INITIAL_CAPACITY];
    }
    public boolean isEmpty(){
        if(size == 0) isEmpty = true;
        return isEmpty;
    }
    private int add;
    public void add(int element) {
        elements[size] = (element);
        size++;
    }
    public void add(int index,String element) {
      for (int counter = (index); counter < elements.length; counter++){
          int temp = (elements[counter]);
          elements[counter] = elements[elements.length - 1];
          elements[elements.length - 1] = temp;

      }
    }
    public int get(int index){
        return elements[index];
    }
//    public void clear(String element){
//
//        clear[element] = element;
//    }

}
