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

        int arrayLength = arrays.length;
        int i;

        if (arrayLength == 0) {
            System.out.println("Пустой массив");
        } else {

            int numberOfNegativeNumbers = 0;

            for (i = 0; i < arrayLength; i++) {
                if (arrays[i] < 0) {
                    numberOfNegativeNumbers += 1;
                }
            }

            if (numberOfNegativeNumbers == arrays.length) {
                System.out.println("Массив отрицательный");
            } else {
                for (i = 0; i < arrayLength; i++) {
                    if (arrays[i] > 0) {
                        System.out.println(arrays[i]);
                    }
                }
            }
        }
    }

    /** Реализовать метод возравщающий массив без дупликатов в нем, при пустом массиве вернуть пустой массив
       Примеры
       in: {1, 1, 2, 2, 3, 4} out: {1, 2, 3, 4}
       in: {} out: {}
     */
    public static int[] notDuplicateArrays(int[] arrays) {

        int length = arrays.length;

        if (length == 0 || length == 1) {
            int j = length;
            return arrays;
        }

        boolean isSorted = false;

        while(isSorted != true) {
            isSorted = true;
            for (int i = 1; i < arrays.length; i++) {
                if (arrays[i] < arrays[i - 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i - 1];
                    arrays[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

            int[] tempArray = new int[length];
            int j = 0;

            for (int i = 0; i < length - 1; i++) {
                if (arrays[i] != arrays[i + 1]) {
                    tempArray[j++] = arrays[i];
                }
            }
            tempArray[j++] = arrays[length - 1];

            for (int i = 0; i < j; i++) {
                arrays[i] = tempArray[i];
            }

        int lengthResult = j;

        int[] resultArrays = new int[lengthResult];

        for (int i = 0; i < lengthResult; i++) {
            resultArrays[i] = arrays[i];
        }

        return resultArrays;
    }

    /** Найти максимальное число в массиве, массив не отсортирован, на вход подаются не пустые массивы */
    public static int maxNumberInArrays(int[] arrays) {
        int maxNumber = arrays[0];

        for (int i = 0; i < arrays.length; i++) {
            if (maxNumber < arrays[i]) {
                maxNumber = arrays[i];
            }
        }

        return maxNumber;
    }

    /** Реализовать метод умножения 2х матриц */
    public static int[][] matrixMulti(int[][] one, int[][] two) {

        if (one[0].length != two.length) {
            System.out.println("Error");
        }

        int[][] result = new int[one.length][two[0].length];
            for (int i = 0; i < one.length; i++) {
                for (int j = 0; j < two[0].length; j++) {
                    for (int k = 0; k < two.length; k++) {
                        result[i][j] += one[i][k] * two[k][j];
                    }
                }
            }
        return result;
    }

    /** реализовать метод быстрой сортиролвки через рекурсию
    //Не совсем про массивы но рекурсию тоже надо знать */
    public static int[] fastSort(int[] arrays) {
        int first = 0;
        int last = arrays.length - 1;

        quickSort(arrays, first, last);
        return arrays;
    }

    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 0)
            return;

        if (left >= right)
            return;

        int center = left + (right - left) / 2;
        int base = array[center];

        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }

            while (array[j] > base) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(array, left, j);

        if (right > i)
            quickSort(array, i, right);
    }
}