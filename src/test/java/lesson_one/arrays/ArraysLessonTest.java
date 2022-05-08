package lesson_one.arrays;

import lesson_one.LessonOneHelper;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysLessonTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testBringToTheScreenArrays() {
        int[] normalArray = {-1, -2, -3, 100, 200, -15, -23, 666, 0};
        ArraysLesson.bringToTheScreenArrays(normalArray);
        assertThat(systemOutRule.getLog()).isEqualTo("100\n200\n666\n0\n");
        systemOutRule.clearLog();

        int[] negativeArray = {-1, -2, -3};
        ArraysLesson.bringToTheScreenArrays(negativeArray);
        assertThat(systemOutRule.getLog()).isEqualTo("Массив отрицательный\n");
        systemOutRule.clearLog();

        int[] emptyArray = {};
        ArraysLesson.bringToTheScreenArrays(emptyArray);
        assertThat(systemOutRule.getLog()).isEqualTo("Пустой массив\n");
        systemOutRule.clearLog();
    }

    @Test
    public void testNotDuplicateArrays() {
        int[] duplicateArrays = {1, 1, 2, 2, 3, 4, 5, 6, 6, 8, 10, 20, 20};
        assertThat(ArraysLesson.notDuplicateArrays(duplicateArrays)).isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 8, 10, 20});

        int[] emptyArrays = {};
        assertThat(ArraysLesson.notDuplicateArrays(emptyArrays)).isEmpty();

        int[] randomArrays = LessonOneHelper.randomArray(100, -100, 100);
        assertThat(ArraysLesson.notDuplicateArrays(randomArrays)).isEqualTo(Arrays.stream(randomArrays).distinct().toArray());
    }

    @Test
    public void testMaxNumberInArrays() {
        int[] testArray = {1, 100, -5, 23, 666, 12, -700, 126};
        assertThat(ArraysLesson.maxNumberInArrays(testArray)).isEqualTo(666);

        int[] randomArrays = LessonOneHelper.randomArray(1000, -1000, 1000);
        assertThat(ArraysLesson.maxNumberInArrays(randomArrays)).isEqualTo(Arrays.stream(randomArrays).max().getAsInt());
    }

    @Test
    public void testMatrixMulti() {
        int[][] one = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] two = new int[][] {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] result = new int[][] {{30, 24, 18}, {84, 69, 54}, {138, 114, 90}};

        assertThat(ArraysLesson.matrixMulti(one, two)).isEqualTo(result);
    }

    @Test
    public void testFastSort() {
        int[] random = LessonOneHelper.randomArray(600, -1000, 1000);

        assertThat(ArraysLesson.fastSort(random)).isEqualTo(Arrays.stream(random).sorted().toArray());
    }
}