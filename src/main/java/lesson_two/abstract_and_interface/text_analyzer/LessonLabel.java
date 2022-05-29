package lesson_two.abstract_and_interface.text_analyzer;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LessonLabel {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for(TextAnalyzer num : analyzers){
            if(!num.processText(text).equals(Label.OK)){
                return num.processText(text);
            }
        }
        return Label.OK;
    }
}

