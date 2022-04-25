package lesson_one.string_lesson;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StringLesson {

    /** Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
     Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая).
     При определении "палиндромности" строки должны учитываться только буквы и цифры.
     А пробелы, знаки препинания, а также регистр символов должны игнорироваться

     Madam, I'm Adam! - true

     для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]";
     найдите в классе String метод, выполняющий замену по регулярному выражению;
     для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(), который находится в классе StringBuilder;
     в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
     */
    public static boolean isPalindrome(String text) {
        String result = text.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = new StringBuilder(result).reverse().toString();
        return result.equalsIgnoreCase(reverse);
    }
    /**
    Pattern p = Pattern.compile("[^a-zA-Z0-9]");
    Matcher m = p.matcher(text);
    String result = m.replaceAll("");
    String reverse = new StringBuilder(result).reverse().toString();
        return result.equalsIgnoreCase(reverse);
     /**

    /**
     * Вам дан список ролей и сценарий пьесы в виде массива строчек.
     *
     * Каждая строчка сценария пьесы дана в следующем виде:
     * Роль: текст
     *
     * Текст может содержать любые символы.
     *
     * Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример).
     * Каждая группа распечатывается в следующем виде:
     *
     * Роль:
     * i) текст
     * j) текст2
     * ...
     * ==перевод строки==
     *
     * i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей.
     * Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
     *
     * Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно, неправильная сборка результирующей строчки может выйти за ограничение по времени.
     *
     * Обратите внимание еще на несколько нюансов:
     *
     * имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
     * название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
     * роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
     * в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
     * будьте внимательны, не добавляйте лишних пробелов в конце строк.
     * Sample Input:
     *
     * roles:
     * Городничий
     * Аммос Федорович
     * Артемий Филиппович
     * Лука Лукич
     * textLines:
     * Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
     * Аммос Федорович: Как ревизор?
     * Артемий Филиппович: Как ревизор?
     * Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
     * Аммос Федорович: Вот те на!
     * Артемий Филиппович: Вот не было заботы, так подай!
     * Лука Лукич: Господи боже! еще и с секретным предписаньем!
     * Sample Output:
     *
     * Городничий:
     * 1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
     * 4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
     *
     * Аммос Федорович:
     * 2) Как ревизор?
     * 5) Вот те на!
     *
     * Артемий Филиппович:
     * 3) Как ревизор?
     * 6) Вот не было заботы, так подай!
     *
     * Лука Лукич:
     * 7) Господи боже! еще и с секретным предписаньем!
     */

    public static String printTextPerRole(String[] roles, String[] textLines) {
        return null;
    }
}
