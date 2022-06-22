package lesson_one.control_structures;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ControlStructures {

    /** Реализовать метод возращающий максимальное число, если числа равны вернуть -1, использовать if */
    public static int max(int a, int b) {
        if (a == b) {
            return -1;
        }
        return Math.max(a, b);
    }

    /** Реализовать метод который будет возращать полное название странны
        На вход подается сокращенное название RU - метод должен вернуть "Russia"
        Если такой странны нет то вернуть "Not country"
        Список стран для метода (RU, IT, DE)
        Использовать Switch
     */
    public static String fullNameCountry(String country) {

        switch (country) {
            case "RU":
                return "Russia";
            case "IT":
                return "Italy";
            case "DE":
                return "Germany";
        }

        return "Not country";
    }

    /** Реализовать метод который переворачить число используя цикл while */
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int numeral = number % 10;
            reversed = reversed * 10 + numeral;
            number /= 10;
        }

        return reversed;
    }

    /** Реализовать метод который будет считать овец
        На входе подается число, если отрицательное вывести на экран что "Овцы так не считаются"
        если положительное то вывод должен быть до максимума заданого числа
        "1 овца..."
        "2 овца..."
        ...
        "n овца..."
     */
    public static void countingSheep(int n) {
        if (n < 0) {
            System.out.print("Овцы так не считаются\n");
        }

        int i = 1;

        while (i <= n) {
            System.out.print(i + " овца...\n");
            i = i + 1;
        }
    }

    /** Реализовать метод вычисления факториала, число на выходе может быть больше размерности int */
    public static BigInteger factorial(int value) {
        BigInteger factorial = BigInteger.valueOf(1);

        while (value != 0) {
            factorial = factorial.multiply(BigInteger.valueOf(value));
            value -= 1;
        }

        return factorial;
    }
}
