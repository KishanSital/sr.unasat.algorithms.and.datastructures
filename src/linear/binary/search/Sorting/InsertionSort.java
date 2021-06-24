package linear.binary.search.Sorting;

public class InsertionSort {

    int[] insertionSort (int [] numberArray){
        int indexOuterLoop, indexInnerLoop, currentCheckingValue;

        // we start at 1 because our first element is always sorted
        for (indexOuterLoop = 1; indexOuterLoop< numberArray.length;indexOuterLoop++){
            currentCheckingValue = numberArray[indexOuterLoop];

            // to be able to compare the currentCheckingValue with the previous value
            indexInnerLoop = indexOuterLoop -1;
        // checking till end of array  and currentCheckingValue is still smaller than the value of the index to the left of it
            while (indexInnerLoop >= 0 && currentCheckingValue < numberArray[indexInnerLoop]){
                // swapping the value
                indexInnerLoop = swappingValue(numberArray, indexInnerLoop);
            }
        }
        return numberArray;
    }

    private int swappingValue(int[] numberArray, int indexInnerLoop) {
        int temporaryStoredValue;
        // storing temporary
        temporaryStoredValue = numberArray[indexInnerLoop];
        // overwriting first value with second value
        numberArray[indexInnerLoop] = numberArray[indexInnerLoop + 1];
        // overwriting second value with first value
        numberArray[indexInnerLoop + 1] = temporaryStoredValue;
        // moving a step to the left of the array to keep on comparing
        indexInnerLoop--;
        return indexInnerLoop;
    }

    void printOutSortedArray(int[] numberArray){
        for (int number:numberArray) {
            System.out.print(" " + number + " " );
        }
    }
}
