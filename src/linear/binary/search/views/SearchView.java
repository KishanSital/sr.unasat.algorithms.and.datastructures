package linear.binary.search.views;

import linear.binary.search.models.PersonModel;
import linear.binary.search.services.SearchService;

import java.util.Scanner;
import java.util.function.Consumer;

public class SearchView {

    private final int valueDoesNotExist = -1;
    private SearchService searchService;
    private Scanner scanner;
    private Consumer<String> println = System.out::println;
    private int arrayStartingIndex = 0;

    public SearchView(SearchService searchService) {
        this.searchService = searchService;
        this.scanner = new Scanner(System.in);
    }

    public void binarySearchOnNumbers() {
        println.accept("This array lies before you : {1,2,3,4,5,6,7,8,9,10}\nNow, enter the value whose index you'd like to find");

        int arrayEndingIndex = searchService.getNumbersArray().length - 1;
        int arraySearchingValue = scanner.nextInt();
        int arraySearchingResult = searchService.recursiveNumberBinarySearch(searchService.getNumbersArray(),
                arrayStartingIndex,
                arrayEndingIndex,
                arraySearchingValue);

        getBinarySearchResult(arraySearchingResult, "Result using recursive binary search", arraySearchingResult == valueDoesNotExist);

        arraySearchingResult = searchService.numberBinarySearch(searchService.getNumbersArray(), arraySearchingValue);

        getBinarySearchResult(arraySearchingResult, "Result using Arrays.binarySearch ", arraySearchingResult < arrayStartingIndex);

    }

    private void getBinarySearchResult(int arraySearchingResult,
                                       String titleSearch,
                                       boolean isResultPresent) {
        println.accept(titleSearch);
        println.accept((isResultPresent) ?
                "Element is not present" :
                "Element found at index " + arraySearchingResult + "\n");
    }

    public void linearSearchOnNumbers() {
        println.accept("This array lies before you : {1,2,3,4,5,6,7,8,9,10}\nNow, enter the value whose index you'd like to find");

        int arraySearchingValue = scanner.nextInt();
        int arraySearchingResult = searchService.numberLinearSearch(searchService.getNumbersArray(),
                arraySearchingValue);

        println.accept(arraySearchingResult == valueDoesNotExist ?
                arraySearchingValue + " is not present in this array" :
                arraySearchingValue + " has been found at index " + arraySearchingResult + "\n");
    }

    public void binarySearchOnText() {
        println.accept("This array lies before you : {aaa,bbb,ccc,ddd}\nNow, enter the value whose index you'd like to find");

        int arrayEndingIndex = searchService.getTextArray().length - 1;
        String arraySearchingValue = scanner.next();
        int arraySearchingResult = searchService.recursiveTextBinarySearch(searchService.getTextArray(),
                arrayStartingIndex,
                arrayEndingIndex,
                arraySearchingValue);

        getBinarySearchResult(arraySearchingResult, "Result using recursive binary search", arraySearchingResult == valueDoesNotExist);

        arraySearchingResult = searchService.textBinarySearch(searchService.getTextArray(), arraySearchingValue);

        getBinarySearchResult(arraySearchingResult, "Result using Arrays.binarySearch ", arraySearchingResult < arrayStartingIndex);
    }

    public void linearSearchOnText() {
        println.accept("This array lies before you : {aaa,bbb,ccc,ddd}\nNow, enter the value whose index you'd like to find");

        String arraySearchingValue = scanner.next();
        int arraySearchingResult = searchService.textLinearSearch(searchService.getTextArray(),
                arraySearchingValue);

        println.accept(arraySearchingResult == valueDoesNotExist ?
                arraySearchingValue + " is not present in this array" :
                arraySearchingValue + " has been found at index " + arraySearchingResult + "\n");
    }

    public void insertPersonIntoPersonArray() {
        PersonModel personModel = new PersonModel();
        println.accept("Please enter person's last name");
        personModel.setLastName(scanner.next());
        println.accept("Please enter person's first name");
        personModel.setFirstName(scanner.next());
        println.accept("Please enter person's age");
        personModel.setAge(scanner.nextInt());
        searchService.insert(personModel);
        println.accept("Insert was successful");
    }

    public void displayPersonArray() {
        searchService.displayA();
    }

    public void searchForPerson() {
        PersonModel personModel;
        println.accept("Please type the person's last name");

        String searchLastName = scanner.next();
        personModel = searchService.find(searchLastName);

        println.accept((personModel != null) ? "Found " + personModel.toString() : "Can't find " + searchLastName);

    }

    public void deletePerson() {
        println.accept("Please type person's last name");

        String deletePerson = scanner.next();
        boolean isDeleted = searchService.delete(deletePerson);

        if(isDeleted){
            println.accept("Person deleted successfully");
        } else {
            println.accept("Something went wrong, please try again");
        }
    }
}
