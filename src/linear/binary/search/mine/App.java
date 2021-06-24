package linear.binary.search.mine;

import linear.binary.search.mine.repositories.SearchRepository;
import linear.binary.search.mine.serviceImpl.QuestionServiceImpl;
import linear.binary.search.mine.serviceImpl.SearchServiceImpl;
import linear.binary.search.mine.services.MenuService;
import linear.binary.search.mine.services.QuestionService;
import linear.binary.search.mine.services.SearchService;
import linear.binary.search.mine.views.MenuView;
import linear.binary.search.mine.views.QuestionView;
import linear.binary.search.mine.views.SearchView;

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
