package lesson_one.primitive;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Primitive {

    /**
     * Вернуть сумму двух чисел
     */
    public static int sum(int a, int b) {
        return a + b;
    } // successful passed by the test

    /**
     * Вернуть разность двух чисел
     */
    public static double sub(double a, double b) {
        return a - b;
    } // successful passed by the test

        /**
         * Вернут сумму двух чисел, но вернуть надо int
         */
    public static int sumNumber(double a, double b) {
        int c = (int) Math.round( a );
        int d = (int) Math.round( b );
        return c + d ;
    } // successful passed by the test. Supposed to be fixed

    /**
     * Вернуть что число является четным, математическим способом
     */
    public static boolean isEven(int number) ;
    {
        ((int number) % 2) == 0) ;
        return true;
    }

    /**
     * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a
     */
    public static char symbol(int number) {
        return '\u0000';
    }

    /**
     * Вернуть последнию цифру от числа
     */
    public static int lastNumber(int number) {
        return 0;
    }

    /**
     * Реализовать метод возращения суммы трехзначного числа, на вход подается всегда трехзначное число
     */
    public static int sumExpression(int number) {
        return 0;
    }

    /**
     * Проверить что a+b=c, Допустимая погрешность – 0.0001, можно использовать Math
     */
    public static boolean doubleExpression(double a, double b, double c) {
        return false;
    }

    /**
     * Реализовать метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false.
     * Look && || ^ !
     * Чтоб легче понять смотри так же таблицу СДНФ
     */
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return false;
    }

}
