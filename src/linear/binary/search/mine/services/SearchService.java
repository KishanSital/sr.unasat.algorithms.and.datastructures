package linear.binary.search.mine.services;

import linear.binary.search.mine.models.PersonModel;

public interface SearchService {
    int[] getNumbersArray();

    int recursiveNumberBinarySearch(int arr[], int l, int r, int x);

    int numberBinarySearch(int arr[], int x);

    int numberLinearSearch(int arr[], int x);

    String[] getTextArray();

    int textBinarySearchIterative(String arr[], int l, int r, String x);

    int textBinarySearch(String arr[], String x);

    int textLinearSearch(String arr[], String x);

    PersonModel find(String searchName);

    void insert(PersonModel personModel);

    boolean delete(String searchName);

    void displayA();
}
