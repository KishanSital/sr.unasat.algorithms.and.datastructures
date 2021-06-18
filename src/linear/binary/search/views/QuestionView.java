package linear.binary.search.views;

import linear.binary.search.services.QuestionService;

import java.util.function.Consumer;

public class QuestionView {

    private QuestionService questionService;
    private Consumer<String> println = System.out::println;

    public QuestionView(QuestionService questionService) {
        this.questionService = questionService;
    }

    public void algorithmAnswer(){
        println.accept(questionService.algorithmAnswer());
    }


    public void dataStructureAnswer(){
        println.accept(questionService.dataStructureAnswer());
    }

    public void bigONotationAnswer(){
        println.accept(questionService.bigONotationAnswer());
    }
}
