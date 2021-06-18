package linear.binary.search;

import linear.binary.search.repositories.SearchRepository;
import linear.binary.search.serviceImpl.QuestionServiceImpl;
import linear.binary.search.serviceImpl.SearchServiceImpl;
import linear.binary.search.services.MenuService;
import linear.binary.search.services.QuestionService;
import linear.binary.search.services.SearchService;
import linear.binary.search.views.MenuView;
import linear.binary.search.views.QuestionView;
import linear.binary.search.views.SearchView;

public class App {

    public static void main(String[] args) {
        int maxSize = 100;

        QuestionService questionServiceImpl = new QuestionServiceImpl();
        SearchService searchServiceImpl = new SearchServiceImpl(new SearchRepository(),maxSize);

        QuestionView questionView = new QuestionView(questionServiceImpl);
        SearchView searchView = new SearchView(searchServiceImpl);

        MenuService menuView = new MenuView(searchView,
                                            questionView);

        menuView.displayMenu();

    }
}
