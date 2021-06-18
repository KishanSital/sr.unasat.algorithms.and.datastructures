package linear.binary.search.repositories;

public class SearchRepository {

    private int [] numberArray;
    private String[] textArray;


    public SearchRepository() {
        super();
        insertNumbersIntoArray();
        insertTextIntoArray();
    }

    private void insertTextIntoArray() {
        textArray = new String[]{"bbb","ccc","aaa","ddd"};
    }

    private void insertNumbersIntoArray(){
        numberArray = new int[] {2,3,4,1,6,5,7,10,9,8};
    }

    public int[] getNumbersArray(){
        return numberArray;
    }

    public String[] getTextArray(){
        return textArray;
    }

}
