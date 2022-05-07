package lesson_two.abstract_and_interface.interfaces;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LessonBookTest {

    @Test
    public void testBook() {
        String[] harryPotter = {
                "The cat didn’t move. It just gave him a stern look. Was this normal cat behavior? Mr. Dursley\n" +
                        "wondered. Trying to pull himself together, he let himself into the house. He was still determined\n" +
                        "not to mention anything to his wife.",
                "Professor McGonagall shot a sharp look at Dumbledore and said “The owls are nothing next to\n" +
                        "the rumors that are flying around. You know what they’re saying? About why he’s disappeared?\n" +
                        "About what finally stopped him?",
                "He looked very pleased with himself, but Hermione didn’t.",
                "It’s not just my hand,” he whispered, “although that feels like it’s about to fall off. Malfoy told\n" +
                        "Madam Pomfrey he wanted to borrow one of my books so he could come and have a good laugh\n" +
                        "at me. He kept threatening to tell her what really bit me — I’ve told her it was a dog, but I don’t\n" +
                        "think she believes me — I shouldn’t have hit him at the Quidditch match, that’s why he’s doing\n" +
                        "this."
        };

        String range = harryPotter[1] + harryPotter[2];

       Book test = new LessonBook(harryPotter);

        assertThat(test.sizeBook()).isEqualTo(4);

        assertThat(test.textByPage(2)).isEqualTo(harryPotter[2]);

        assertThat(test.textByPage(10)).isEmpty();

        assertThat(test.textByRange(1, 2)).isEqualTo(range);

        assertThat(test.textByRange(5, 20)).isEmpty();

        assertThat(test.findPageByText("Professor McGonagall")).isEqualTo(1);

        assertThat(test.findPageByText("NOT_FOUND")).isEqualTo(-1);

        assertThat(test.text()).isEqualTo(String.join("", harryPotter));
    }

}