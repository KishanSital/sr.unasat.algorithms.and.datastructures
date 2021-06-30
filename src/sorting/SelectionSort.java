package sorting;

public class SelectionSort {

    int[] selectionSort(int[] numberSort) {

        int outerLoopIndex, innerLoopIndex, smallestValue, indexOfSmallestValue, temporaryValue = 0;

        for (outerLoopIndex = 0; outerLoopIndex < numberSort.length; outerLoopIndex++) {

            // storing the value of the first index as the smallest value
            smallestValue = numberSort[outerLoopIndex];
            // storing index of the smallest value
            indexOfSmallestValue = outerLoopIndex;

// assigning the starting innerLoopIndex with the one of the outerLoop and looping through the array
            for (innerLoopIndex = outerLoopIndex; innerLoopIndex < numberSort.length; innerLoopIndex++) {
                if (numberSort[innerLoopIndex] < smallestValue) {
// if value if the current innerLoopIndex is smaller than our previously stored "smallestValue"
                    // re-assign the smallest value from the newly found one of the current index
                    smallestValue = numberSort[innerLoopIndex];
                    // re-assign the index of the smallest value
                    indexOfSmallestValue = innerLoopIndex;
                }
            }

            if (smallestValue < numberSort[outerLoopIndex]) {
// if the previously stored smallest value is smaller than the value of the current index of the outer loop

                //store the larger value temporary
                temporaryValue = numberSort[outerLoopIndex];
                //swapping the larger value with the smaller value
                numberSort[outerLoopIndex] = numberSort[indexOfSmallestValue];
                //swapping the smaller value with the larger value
                numberSort[indexOfSmallestValue] = temporaryValue;
            }
        }
        return numberSort;
    }

    void printOutSortedArray(int[] numberArray) {
        for (int number : numberArray) {
            System.out.print(" " + number + " ");
        }
    }
}
