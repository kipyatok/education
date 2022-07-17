package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.NEGATIVE_TEXT;

public class NegativeTextAnalyzer  extends KeywordAnalyzer {

    static final String[] NEGATIVE_KEYWORDS = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return NEGATIVE_KEYWORDS;
    }

    @Override
    public Label getLabel() {
        return NEGATIVE_TEXT;
    }
}
