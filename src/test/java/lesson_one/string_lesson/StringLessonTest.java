package lesson_one.string_lesson;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringLessonTest {

    @Test
    public void testIsPalindrome() {
        assertThat(StringLesson.isPalindrome("Madam, I'm Adam!")).isTrue();
        assertThat(StringLesson.isPalindrome("No 123 Palindrome")).isFalse();
        assertThat(StringLesson.isPalindrome("TENET")).isTrue();
        assertThat(StringLesson.isPalindrome("Al lets Della call Ed “Stella.”")).isTrue();
        assertThat(StringLesson.isPalindrome(
                "Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, " +
                        "Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, " +
                        "Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, " +
                        "Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, " +
                        "and Ellen sinned."))
                .isTrue();
    }

    @Test
    public void testPrintTextPerRole() {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String result = "Городничий:\n" +
                "1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.\n" +
                "4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n" +
                "\n" +
                "Аммос Федорович:\n" +
                "2) Как ревизор?\n" +
                "5) Вот те на!\n" +
                "\n" +
                "Артемий Филиппович:\n" +
                "3) Как ревизор?\n" +
                "6) Вот не было заботы, так подай!\n" +
                "\n" +
                "Лука Лукич:\n" +
                "7) Господи боже! еще и с секретным предписаньем!\n\n";

        assertThat(StringLesson.printTextPerRole(roles, textLines))
                .isNotNull()
                .isEqualTo(result);
    }
}