package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.NEGATIVE_TEXT;
import static lesson_two.abstract_and_interface.text_analyzer.Label.OK;

public class NegativeTextAnalyzer  extends KeywordAnalyzer {

    NegativeTextAnalyzer(){} // fixme ???

    @Override
    protected String[] getKeywords() { //fixme public
        String[] sad = new String[]{":(", "=(", ":|"}; // fixme move to field class, maybe constant?
        return sad;
    }

    @Override
    protected Label getLabel() {
        return NEGATIVE_TEXT;
    } //fixme public
}
