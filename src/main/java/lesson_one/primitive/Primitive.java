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
        int c = (int) ( a ); //fixme ( a ) don't write like that -> (a)
        int d = (int) ( b );
        int f = (c + d);
        return f;
    }
        // fixme see Java Type Casting , example double a = 1.0; int b = (int) a; This works on the +- operators as well.
    // I would fix  it, if it can be shorter! P.S thanks for your example and patience.


    /**
     * Вернуть что число является четным, математическим способом
     */
    public static boolean isEven(int number) {
        return ((number) % 2) == 0 ; // odd = false , even = true
        // fixme return, remove if
        // done
    }

    /**
     * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a
     */
    public static char symbol(int number) {

        char a = '\u041c';
        char b = (int) a;
         b= (a + number);
        char c= (char)b;
        return c;

/*       char A = '\u041c';
        String hexA = String.format("%04x", (int) A); // the symbol "\" in hex
        String hexB = Integer.toHexString( number ); // number in hex
        int hexC;
        hexC = (hexA + hexB);
        char result ;
        hexC = (char) result;
        return result;
         */
       // return '\u0000';
    }


    /*
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
