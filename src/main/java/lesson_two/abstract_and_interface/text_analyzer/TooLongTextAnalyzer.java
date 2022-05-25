package lesson_two.abstract_and_interface.text_analyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return null;
    } //fixme add logic
}
