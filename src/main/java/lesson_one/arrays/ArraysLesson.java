package lesson_one.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ArraysLesson { //FIXME refactor code

    /** реализовать метод который будет выводить все положительные числа на экран, при пустом массиве вывести "Пустой массив"
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
        int[] xyz = {}; //FIXME rename. maybe emptyArray
        if(Arrays.equals(arrays, xyz)){
            System.out.print("Пустой массив\n");
            return;
        }
        boolean chek = true;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] >= 0){ //FIXME
                chek = false;
            }
            if (chek == false){ //fixme error
                break;
            }
        }
        if (chek == true){ //FIXME error
            System.out.print("Массив отрицательный\n");
            return;
        }
        //Arrays.toString()
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] >= 0){ //fixme duclication code
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
        if ((arrays.length == 0) || (arrays.length == 1)){
            return arrays;
        }
        quickSort(arrays, 0,arrays.length - 1);
        return arrays;
    }

    private static void quickSort(int[] arrays, int left, int right) {
        int l = left;
        int r = right;
        int opora = arrays[left];
        while (left < right) {
            while ((arrays[right] >= opora) && (left < right)) {
                right--;
            }
            if (left != right) {
                arrays[left] = arrays[right];
                left++;
            }
            while ((arrays[left] <= opora) && (left < right)) {
                left++;
            }
            if (left != right) {
                arrays[right] = arrays[left];
                right--;
            }
        }
        arrays[left] = opora;
        opora = left;
        left = l;
        right = r;
        if (left < opora) {
            quickSort(arrays, left, opora - 1);
        }
        if (right > opora){
            quickSort(arrays, opora + 1, right);
        }
    }


}
