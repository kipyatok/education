package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.NEGATIVE_TEXT;
import static lesson_two.abstract_and_interface.text_analyzer.Label.OK;

public class NegativeTextAnalyzer  extends KeywordAnalyzer {

    NegativeTextAnalyzer(){}

    @Override
    protected String[] getKeywords() {
        String[] sad = new String[]{":(", "=(", ":|"};
        return sad;
    }

    @Override
    protected Label getLabel() {
        return NEGATIVE_TEXT;
    }
}
