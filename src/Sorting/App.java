package Sorting;

public class App {

    public static void main(String[] args) {
        int numberArray[] = {64, 34, 25, 12, 22, 11, 90};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(numberArray);
        System.out.println("bubble sorted array");
        bubbleSort.printArray(numberArray);


        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(numberArray);
        System.out.println("insertion sorted array");
        insertionSort.printOutSortedArray(numberArray);


        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(numberArray);
        System.out.println("selection sorted array");
        selectionSort.printOutSortedArray(numberArray);

    }

}
