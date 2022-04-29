package lesson_one.classes_wrap;

import static java.lang.Double.compare;

/** Использовать только методы классов оберток! */
public class Wrap {

    /** Реализовать метод упаковки примитива в класс Integer */
    public static Integer boxing(int number) {
        return number * 1;
    } //FIXME valueOf

    /** Реализовать метод перевода строки в число, используя методы Integer */
    public static Integer stringToInteger(String number) {
        return Integer.parseInt(number);
    }

    /** Реализовать метод возращающий максимольное значение int */
    public static int maxInt() {
        return Integer.MAX_VALUE;
    }

    /** Реализовать метод проверяющий что данный символ буква */
    public static boolean isLetter(char symbol) {
        return Character.isLetter(symbol);
    }

    /** Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.Использовать методы Integer */
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

    /** Реализовать методо сравнения двух вещественных чисел, использую Double */
    public static int comparison(double a, double b) {
        return compare(a, b);
    }

}
