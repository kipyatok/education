package lesson_one.control_structures;

import com.google.common.math.BigIntegerMath;
import lesson_one.LessonOneHelper;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.assertThat;

public class ControlStructuresTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMax() {
        assertThat(ControlStructures.max(1, 2)).isEqualTo(2);
        assertThat(ControlStructures.max(5, 1)).isEqualTo(5);
        assertThat(ControlStructures.max(1, 1)).isEqualTo(-1);
    }

    @Test
    public void testFullNameCountry() {
        assertThat(ControlStructures.fullNameCountry("RU")).isEqualTo("Russia");
        assertThat(ControlStructures.fullNameCountry("IT")).isEqualTo("Italy");
        assertThat(ControlStructures.fullNameCountry("DE")).isEqualTo("Germany");
        assertThat(ControlStructures.fullNameCountry("AU")).isEqualTo("Not country");
    }

    @Test
    public void testReverse() {
        assertThat(ControlStructures.reverse(123)).isEqualTo(321);
        assertThat(ControlStructures.reverse(-2932)).isEqualTo(-2392);
        assertThat(ControlStructures.reverse(100)).isEqualTo(1);
    }

    @Test
    public void testCountingSheep() {
        ControlStructures.countingSheep(3);
        assertThat(systemOutRule.getLog()).isEqualTo(LessonOneHelper.countingSheep(3));

        systemOutRule.clearLog();

        ControlStructures.countingSheep(50);
        assertThat(systemOutRule.getLog()).isEqualTo(LessonOneHelper.countingSheep(50));

        systemOutRule.clearLog();

        ControlStructures.countingSheep(-2);
        assertThat(systemOutRule.getLog()).isEqualTo("Овцы так не считаются\n");
    }

    @Test
    public void testFactorial() {
        assertThat(ControlStructures.factorial(1)).isEqualTo(1);
        assertThat(ControlStructures.factorial(6)).isEqualTo(720);
        assertThat(ControlStructures.factorial(100)).isEqualTo(BigIntegerMath.factorial(100));
        assertThat(ControlStructures.factorial(666)).isEqualTo(BigIntegerMath.factorial(666));
    }

}