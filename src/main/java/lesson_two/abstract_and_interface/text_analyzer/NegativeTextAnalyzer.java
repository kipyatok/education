package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.NEGATIVE_TEXT;
import static lesson_two.abstract_and_interface.text_analyzer.Label.OK;

public class NegativeTextAnalyzer  extends KeywordAnalyzer implements TextAnalyzer{

    @Override
    protected String[] getKeywords() {
        String[] sad = new String []{":(", "=(", ":|"};
        return sad;
    }

    @Override
    protected Label getLabel() {
        return NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        for (int i = 0; i < getKeywords().length; i++) {
            if(text.indexOf(getKeywords()[i]) >= 0){
                return getLabel();
            }
        }
        return OK;
    }
}
