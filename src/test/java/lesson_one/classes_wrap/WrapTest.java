package lesson_one.classes_wrap;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WrapTest {

    @Test
    public void testBoxing() {
        assertThat(Wrap.boxing(7)).isNotNull().isEqualTo(7);
        assertThat(Wrap.boxing(-1)).isNotNull().isEqualTo(-1);
    }

    @Test
    public void testStringToInteger() {
        assertThat(Wrap.stringToInteger("7")).isNotNull().isEqualTo(7);
        assertThat(Wrap.stringToInteger("2")).isNotNull().isEqualTo(2);
    }

    @Test
    public void testMaxInt() {
        assertThat(Wrap.maxInt()).isEqualTo(2147483647);
    }

    @Test
    public void testIsLetter() {
        assertThat(Wrap.isLetter('c')).isTrue();
        assertThat(Wrap.isLetter('1')).isFalse();
    }

    @Test
    public void testIsPowerOfTwo() {
        assertThat(Wrap.isPowerOfTwo(0)).isFalse();
        assertThat(Wrap.isPowerOfTwo(1)).isTrue();
        assertThat(Wrap.isPowerOfTwo(10)).isFalse();
        assertThat(Wrap.isPowerOfTwo(16)).isTrue();
        assertThat(Wrap.isPowerOfTwo(10231232)).isFalse();
        assertThat(Wrap.isPowerOfTwo(-2)).isTrue();
    }

    @Test
    public void testComparison() {
        assertThat(Wrap.comparison(1.3, 1.7)).isEqualTo(-1);
        assertThat(Wrap.comparison(1.5, 1.1)).isEqualTo(1);
        assertThat(Wrap.comparison(1.1, 1.1)).isZero();
    }

}