package lesson_one.control_structures;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ControlStructures {

    //todo Реализовать метод возращающий максимальное число, если числа равны вернуть -1, использовать if
    public static int max(int a, int b) {
        if (a == b){
            return -1;
        }
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }

    /*todo Реализовать метод который будет возращать полное название странны
        На вход подается сокращенное название RU - метод должен вернуть "Russia"
        Если такой странны нет то вернуть "Not country"
        Список стран для метода (RU, IT, DE)
        Использовать Switch
     */
    public static String fullNameCountry(String country) {
        switch (country){
            case "RU":
                return "Russia";
            case "IT":
                return "Italy";
            case "DE":
                return "Germany";
            default:
                return "Not country";
        }
    }

    //todo Реализовать метод который переворачить число используя цикл while
    public static int reverse(int number) {
        return 0;
    }

    /*todo Реализовать метод который будет считать овец
        На входе подается число, если отрицательное вывести на экран что "Овцы так не считаются"
        если положительное то вывод должен быть до максимума заданого числа
        "1 овца..."
        "2 овца..."
        ...
        "n овца..."
     */
    public static void countingSheep(int n) {
        if ( n < 0){
            System.out.print("Овцы так не считаются\n");
        }
        else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " овца...\n");
            }
        }
    }

    //todo Реализовать метод вычисления факториала, число на выходе может быть больше размерности int
    public static BigInteger factorial(int value) {
        return BigInteger.ONE;
    }
}
