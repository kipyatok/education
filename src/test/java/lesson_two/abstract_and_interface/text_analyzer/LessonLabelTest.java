package lesson_two.abstract_and_interface.text_analyzer;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LessonLabelTest {

    @Test
    public void testCheckLabel() {
        TextAnalyzer[] textAnalyzers = {
                new SpamAnalyzer(new String[]{"spam", "bad"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(40)
        };

        assertThat(LessonLabel.checkLabels(textAnalyzers, "This comment is so good.")).isEqualTo(Label.OK);

        assertThat(LessonLabel.checkLabels(textAnalyzers, "This comment is so Loooooooooooooooooooooooooooong.")).isEqualTo(Label.TOO_LONG);

        assertThat(LessonLabel.checkLabels(textAnalyzers, "This comment is so bad....")).isEqualTo(Label.SPAM);

        assertThat(LessonLabel.checkLabels(textAnalyzers, "Very negative comment !!!!=(!!!!;")).isEqualTo(Label.NEGATIVE_TEXT);
    }
}