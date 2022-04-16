package lesson_one.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ArraysLesson {

    /** реализовать методо который будет выводить все положительные числа на экран, при пустом массиве вывести "Пустой массив"
       При польностью отрицательных числах вывести "Массив отрицательный"
       Пример:
       in: {-1, 2, 3, -5}
       out: 2
            3
       //
       in: {-1, -2, -100}
       out: Массив отрицательный
       //
        in: {}
        out: Пустой массив

     */
    public static void bringToTheScreenArrays(int[] arrays) {
        // You code
    }

    /** Реализовать метод возравщающий массив без дупликатов в нем, при пустом массиве вернуть пустой массив
       Примеры
       in: {1, 1, 2, 2, 3, 4} out: {1, 2, 3, 4}
       in: {} out: {}
     */
    public static int[] notDuplicateArrays(int[] arrays) {
        return null;
    }

    /** Найти максимальное число в массиве, массив не отсортирован, на вход подаются не пустые массивы */
    public static int maxNumberInArrays(int[] arrays) {
        return 0;
    }

    /** Реализовать метод умножения 2х матриц */
    public static int[][] matrixMulti(int[][] one, int[][] two) {
        return null;
    }

    /** реализовать метод быстрой сортиролвки через рекурсию
    //Не совсем про массивы но рекурсию тоже надо знать */
    public static int[] fastSort(int[] arrays) {
        return null;
    }
}
