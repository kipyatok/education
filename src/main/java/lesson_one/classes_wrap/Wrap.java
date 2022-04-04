package lesson_one.classes_wrap;

//Todo Использовать только методы классов оберток!
public class Wrap {

    // Todo реализовать метод упаковки примитива в класс Integer
    public static Integer boxing(int number) {
        return number * 1;
    }

    //Todo реализовать метод перевода строки в число, используя методы Integer
    public static Integer stringToInteger(String number) {
        return Integer.parseInt(number);
    }

    //Todo Реализовать метод возращающий максимольное значение int
    public static int maxInt() {
        return Integer.MAX_VALUE;
    }

    //Todo Реализовать метод проверяющий что данный символ буква
    public static boolean isLetter(char symbol) {
        return false;
    }

    //Todo Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.Использовать методы Integer
    public static boolean isPowerOfTwo(int value) {
        return false;
    }

    //Todo Реализовать методо сравнения двух вещественных чисел, использую Double
    public static int comparison(double a, double b) {
        return 0;
    }

}
