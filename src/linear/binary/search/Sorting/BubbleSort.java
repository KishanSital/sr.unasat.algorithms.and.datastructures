package linear.binary.search.Sorting;

public class BubbleSort {
    public void bubbleSort(int numberArray[]) {
        int arraySize = numberArray.length;
        int arrayEndingIndex = arraySize - 1;
        for (int outerLoopIterationIndex = 0; outerLoopIterationIndex < arrayEndingIndex; outerLoopIterationIndex++)
            for (int innerLoopIterationIndex = 0; innerLoopIterationIndex < arrayEndingIndex - outerLoopIterationIndex; innerLoopIterationIndex++)
                // checking whether the value of the first element is greater than the value of the second element (of this iteration)
                if (numberArray[innerLoopIterationIndex] > numberArray[innerLoopIterationIndex + 1]) {
                    // temporary storing value of first element when comparing between first and second value (of this iteration)
                    int temporarySaveForFirstElementComparedValue = numberArray[innerLoopIterationIndex];
                    // temporary storing the index of the second value when comparing between first and second value (of this iteration)
                    int secondComparedValueIndex = innerLoopIterationIndex + 1;
                    //overwriting the value of the first element with the value of the second element
                    numberArray[innerLoopIterationIndex] = numberArray[secondComparedValueIndex];
                    //overwriting the value of the second element with the value of the first element that we've stored (of this iteration)
                    numberArray[secondComparedValueIndex] = temporarySaveForFirstElementComparedValue;
                }
    }
    void printArray(int numberArray[]) {
        for (int number : numberArray) {
            System.out.print(" " + number + " ");
        }
    }
}

