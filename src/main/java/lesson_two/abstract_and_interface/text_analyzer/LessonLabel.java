package lesson_two.abstract_and_interface.text_analyzer;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LessonLabel {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if(!analyzers[i].processText(text).equals(Label.OK)){
                return analyzers[i].processText(text);
            }
        }
        return Label.OK;
    }
}

