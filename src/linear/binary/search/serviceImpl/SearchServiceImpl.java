package linear.binary.search.serviceImpl;

import linear.binary.search.models.PersonModel;
import linear.binary.search.repositories.SearchRepository;
import linear.binary.search.services.SearchService;

import java.util.Arrays;

public class SearchServiceImpl implements SearchService {

    private SearchRepository searchRepository;
    private PersonModel[] personArray; 
    private int totalElements; 

    public SearchServiceImpl(SearchRepository searchRepository, int max) {
        this.searchRepository = searchRepository;
        personArray= new PersonModel[max];
        totalElements = 0;
    }


    @Override
    public int[] getNumbersArray(){
        return searchRepository.getNumbersArray();
    }

    @Override
    public String[] getTextArray(){
        return searchRepository.getTextArray();
    }

    @Override
    public int recursiveNumberBinarySearch(int arr[], int l, int r, int x) {
        Arrays.sort(arr);
        if (r >= l) {
            int mid = l + (r - l) / 2;
            //Check if element is present in the middle
            if (arr[mid] == x) {
                return mid;
            }
            // If element is smaller than mid, then it can only be present in left subarray
            else if (arr[mid] > x) {
                return recursiveNumberBinarySearch(arr, l, mid - 1, x);
                // At this point the element can only be present in right subarray
            } else {
                return recursiveNumberBinarySearch(arr, mid + 1, r, x);
            }
        }
        // If element is not present in the array
        return -1;
    }

    @Override
    public int numberBinarySearch(int arr[], int x){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, x);
    }

    @Override
    public int numberLinearSearch(int arr[], int x){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return  -1;
    }


    @Override
    public int textBinarySearchIterative(String arr[], int l, int r, String x) {
        Arrays.sort(arr);
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            // Check if x is present at mid
            if (res == 0) {
                return m;
            }
            // If x greater, ignore left half
           else if (res > 0) {
                l = m + 1;
            }
                // If x is smaller, ignore right half
            else {
                r = m - 1;
            }
        }
        return -1;
    }

    @Override
    public int textBinarySearch(String arr[], String x){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, x);
    }

    @Override
    public int textLinearSearch(String arr[], String x){
        for (int i = 0; i< arr.length; i++){
            if (arr[i].equals(x)){
                return i;
            }
        }
        return  -1;
    }

    @Override
    public PersonModel find(String searchName) { // find specified value
        int j;
        for(j=0; j<totalElements; j++) // for each element,
            if( personArray[j].getLastName().equals(searchName) ) // found item?
                break; // exit loop before end
        if(j == totalElements) // gone to end?
            return null; // yes, can’t find it
        else
            return personArray[j]; // no, found it
    } // end find()


    // put person into array
    @Override
    public void insert(PersonModel personModel) {
        personArray[totalElements] = new PersonModel(personModel);
        totalElements++; // increment size
    }

    @Override
    public boolean delete(String searchName){ // delete person from array
        int j;
        for(j=0; j<totalElements; j++) // look for it
            if( personArray[j].getLastName().equals(searchName) )
                break;
        if(j==totalElements) // can’t find it
            return false;
        else // found it
        {
            for(int k=j; k<totalElements; k++) // shift down
                personArray[k] = personArray[k+1];
            totalElements--; // decrement size
            return true;
        }
    } // end delete()

    @Override
    public void displayA() { // displays array contents
        for(int j=0; j<totalElements; j++) // for each element,
            personArray[j].displayPerson(); // display it
    }

}
