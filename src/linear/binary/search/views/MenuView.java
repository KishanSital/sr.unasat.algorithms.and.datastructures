package linear.binary.search.views;

import linear.binary.search.services.MenuService;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuView implements MenuService {

    private Scanner scanner;
    private static List<String> menuOptionsList;
    private final int exitCode = 12;
    private final int questionMessageIndex = 0;
    private SearchView searchView;
    private QuestionView questionView;

    public MenuView() {
        super();
        init();
    }

    public MenuView(SearchView searchView,
                    QuestionView questionView) {
        this();
        this.searchView = searchView;
        this.questionView = questionView;
    }

    public void init(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayMenu() {
        int choiceEntry = 0;
        do {
           menuOptions();
            try{
                choiceEntry = scanner.nextInt();
            }catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Please type a valid number\n");
                continue;
            }
            switch (choiceEntry) {
                case 1:
                    questionView.algorithmAnswer();
                    break;
                case 2:
                    questionView.dataStructureAnswer();
                    break;
                case 3:
                    questionView.bigONotationAnswer();
                    break;
                case 4:
                    searchView.binarySearchOnNumbers();
                    break;
                case 5:
                    searchView.linearSearchOnNumbers();
                    break;
                case 6:
                    searchView.binarySearchOnText();
                    break;
                case 7:
                    searchView.linearSearchOnText();
                    break;
                case 8:
                    searchView.insertPersonIntoPersonArray();
                    break;
                case 9:
                    searchView.displayPersonArray();
                    break;
                case 10:
                    searchView.deletePerson();
                    break;
                case 11:
                    searchView.searchForPerson();
                    break;
                case 12:
                    System.out.println("You've been logged out successfully\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choice must be between 1 and "
                            + exitCode + "\n");
            }
        } while (choiceEntry != exitCode);
    }

    private void menuOptions() {
        menuOptionsList = new ArrayList<>();
        menuOptionsList.add("\tWelcome");
        menuOptionsList.add("to view answer for 'wat is een algoritme?'");
        menuOptionsList.add("to view answer for 'wat is een datastructuur?'");
        menuOptionsList.add("to view answer for 'wat is de Big O notation?'");
        menuOptionsList.add("to use binary search on a number array");
        menuOptionsList.add("to use a linear search on a number array");
        menuOptionsList.add("to use binary search on a text array");
        menuOptionsList.add("to use a linear search on a text array");
        menuOptionsList.add("to insert a person into Person array");
        menuOptionsList.add("to display all persons");
        menuOptionsList.add("to delete a person");
        menuOptionsList.add("to find a person");
        menuOptionsList.add("to exit the application");
        printOutMenuOptions();
    }

    private void printOutMenuOptions() {
        for (int i = 0; i < menuOptionsList.size(); i++) {
            if (i == questionMessageIndex) {
                System.out.println(menuOptionsList.get(i));
                continue;
            } else {
                System.out.println("Type " + i + " " + menuOptionsList.get(i));
            }
        }
    }
}
