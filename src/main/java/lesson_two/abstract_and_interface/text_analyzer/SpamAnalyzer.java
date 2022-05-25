package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.SPAM;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer { //fixme remove implements

    private String[] keywords;

    public SpamAnalyzer(String[] keyWords){ //fixme rename keyWords -> keywords
        this.keywords = keyWords;
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return SPAM;
    }

    @Override
    public Label processText(String text) { // fixme remove, implementation should be in KeywordAnalyzer
        return null;
    }
}
