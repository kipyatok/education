package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.OK;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        for (int i = 0; i < getKeywords().length; i++) {
            if(text.indexOf(getKeywords()[i]) >= 0){
                return getLabel();
            }
        }
        return OK;
    }
}
