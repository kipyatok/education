package lesson_one;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LessonOneHelper {

    public static String countingSheep(int size) {
        return Stream.iterate(1, n -> n + 1).limit(size)
                .map(x -> x + " овца...\n")
                .collect(Collectors.joining());
    }
}
