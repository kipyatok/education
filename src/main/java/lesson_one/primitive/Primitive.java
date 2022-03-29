package lesson_one.primitive;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Primitive {

    // TODO Вернуть сумму двух чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    // TODO Вернуть разность двух чисел
    public static double sub(double a, double b) {
        return a - b;
    }

    // TODO Вернут сумму двух чисел, но вернуть надо int
    public static int sumNumber(double a, double b) {
        return (int) (a + b);
    }

    //TODO Вернуть что число является четным, математическим способом
    public static boolean isEven(int number) {
        return number %2 == 0 ? true : false;
    } //FIXME remove true : false , == - logic operation. Space!

    //TODO Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a
    public static char symbol(int number) {
        return (char) (92 + number);
    }

    //TODO Вернуть последнию цифру от числа
    public static int lastNumber(int number) {
        return number % 10;
    }

    //TODO Реализовать метод возращения суммы трехзначного числа, на вход подается всегда трехзначное число
    public static int sumExpression(int number) {
        return (number % 10) + (((number - (number % 10)) % 100) / 10) + (number / 100);
    }

    //TODO Проверить что a+b=c, Допустимая погрешность – 0.0001, можно использовать Math
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.0001;
    }

    /* TODO Реализовать метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false.
        Look && || ^ !
        Чтоб легче понять смотри так же таблицу СДНФ
     */
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a && b && !c && !d) || (a && !b && c && !d) || (a && !b && !c && d) || (!a && b && c && !d) || (!a && b && !c && d) || (!a && !b && c && d);
    }

}
