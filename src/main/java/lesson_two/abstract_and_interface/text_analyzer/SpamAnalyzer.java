package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.SPAM;

public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return SPAM;
    }
}
