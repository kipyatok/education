package lesson_two.abstract_and_interface.text_analyzer;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LessonLabel {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        if(!analyzers[0].processText(text).equals(Label.OK)){
            return analyzers[0].processText(text);
        }
        if(!analyzers[1].processText(text).equals(Label.OK)){
            return analyzers[1].processText(text);
        }
        if(!analyzers[2].processText(text).equals(Label.OK)){
            return analyzers[2].processText(text);
        }
        return Label.OK;
    }
}
