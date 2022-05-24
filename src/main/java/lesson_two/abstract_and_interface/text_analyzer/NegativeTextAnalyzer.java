package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.NEGATIVE_TEXT;

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
        return null;
    }
}
