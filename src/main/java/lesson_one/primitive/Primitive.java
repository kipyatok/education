package lesson_one.primitive;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Primitive {

    // TODO Вернуть сумму двух чисел
    public static int sum(int a, int b) {
        return 0;
    }

    // TODO Вернуть разность двух чисел
    public static double sub(double a, double b) {
        return 0;
    }

    // TODO Вернут сумму двух чисел, но вернуть надо int
    public static int sumNumber(double a, double b) {
        return 0;
    }

    //TODO Вернуть что число является четным, математическим способом
    public static boolean isEven(int number) {
        return false;
    }

    //TODO Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a
    public static char symbol(int number) {
        return '\u0000';
    }

    //TODO Вернуть последнию цифру от числа
    public static int lastNumber(int number) {
        return 0;
    }

    //TODO Реализовать метод возращения суммы трехзначного числа, на вход подается всегда трехзначное число
    public static int sumExpression(int number) {
        return 0;
    }

    //TODO Проверить что a+b=c, Допустимая погрешность – 0.0001, можно использовать Math
    public static boolean doubleExpression(double a, double b, double c) {
        return false;
    }

    /* TODO Реализовать метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false.
        Look && || ^ !
        Чтоб легче понять смотри так же таблицу СДНФ
     */
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return false;
    }

}
