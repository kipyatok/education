package lesson_one;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LessonOneHelper {

    public static String countingSheep(int size) {
        return Stream.iterate(1, n -> n + 1).limit(size)
                .map(x -> x + " овца...\n")
                .collect(Collectors.joining());
    }

    public static int[] randomArray(int size, int low, int high) {
        Random rand = new Random();
        return Stream.iterate(1, n -> n + 1)
                .limit(size)
                .mapToInt(x -> low + rand.nextInt(high - low + 1))
                .toArray();
    }

    public static double[][] intToDoubleArray(int[][] array) {
        Object[] toArray = Arrays.stream(array).map(x -> Arrays.stream(x).asDoubleStream().toArray()).toArray();
        return Arrays.copyOf(toArray, toArray.length, double[][].class);
    }
}
