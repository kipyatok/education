package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.NEGATIVE_TEXT;
import static lesson_two.abstract_and_interface.text_analyzer.Label.OK;

public class NegativeTextAnalyzer  extends KeywordAnalyzer implements TextAnalyzer{ //fixme remove implements

    @Override
    protected String[] getKeywords() {
        String[] sad = new String []{":(", "=(", ":|"}; //fixme move to field class, maybe rename negativeText ?
        return sad;
    }

    @Override
    protected Label getLabel() {
        return NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) { //fixme remove, implementation should be in KeywordAnalyzer
        for (int i = 0; i < getKeywords().length; i++) { //fixme use foreach
            if(text.indexOf(getKeywords()[i]) >= 0){ //fixme use contains
                return getLabel();
            }
        }
        return OK;
    }
}
