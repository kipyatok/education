package lesson_two.abstract_and_interface.text_analyzer;

import static lesson_two.abstract_and_interface.text_analyzer.Label.SPAM;

public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    } //fixme public

    @Override
    protected String[] getKeywords() {
        return keywords;
    } //fixme public

    @Override
    protected Label getLabel() {
        return SPAM;
    } //fixme public
}
