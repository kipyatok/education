package lesson_one.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;

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
        int[] xyz = {};
        if(Arrays.equals(arrays, xyz)){
            System.out.print("Пустой массив\n");
            return;
        }
        boolean chek = true;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] >= 0){
                chek = false;
            }
            if (chek == false){
                break;
            }
        }
        if (chek == true){
            System.out.print("Массив отрицательный\n");
            return;
        }
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] >= 0){
                System.out.print(arrays[i] + "\n");
            }
        }
    }





    /** Реализовать метод возравщающий массив без дупликатов в нем, при пустом массиве вернуть пустой массив
       Примеры
       in: {1, 1, 2, 2, 3, 4} out: {1, 2, 3, 4}
       in: {} out: {}
     */
    public static int[] notDuplicateArrays(int[] arrays) {
            int n = arrays.length;
        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (arrays[j] != arrays[i]){
                    if (m != j){
                        arrays[m] = arrays[j];
                    }
                    m++;
                }
            }
        }
        if (n != arrays.length){
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = arrays[i];
            }
            arrays = b;
        }
        return arrays;
    }






    /** Найти максимальное число в массиве, массив не отсортирован, на вход подаются не пустые массивы */
    public static int maxNumberInArrays(int[] arrays) {
        int max = arrays[0];
        for (int i = 1; i < arrays.length - 1; i++) {
            if (arrays[i] > max){
                max = arrays[i];
            }
        }
        return max;
    }

    /** Реализовать метод умножения 2х матриц */
    public static int[][] matrixMulti(int[][] one, int[][] two) {
        int[][] result = new int[one.length][two[0].length];
        for (int i = 0; i < result[0].length; i++) {
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; k < one[0].length; k++) {
                    result[i][j] = result[i][j] + one[i][k] * two[k][j];
                }
            }
        }
        return result;
    }

    /** реализовать метод быстрой сортиролвки через рекурсию
    //Не совсем про массивы но рекурсию тоже надо знать */
    public static int[] fastSort(int[] arrays) {
        return null;
    }
}
