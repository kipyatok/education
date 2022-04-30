package lesson_two.object;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComplexNumberTest {

    @Test
    public void testComplexNumber() {
        ComplexNumber one = new ComplexNumber(1.12, 2.12);
        ComplexNumber two = new ComplexNumber(1.12, 2.12);
        ComplexNumber three = new ComplexNumber(2.0, 2.0);

        assertThat(one.equals(one)).isTrue();
        assertThat(one.equals(two)).isTrue();
        assertThat(one.equals(three)).isFalse();

        assertThat(one.hashCode()).isEqualTo(one.hashCode());
        assertThat(one.hashCode()).isEqualTo(two.hashCode());
        assertThat(one.hashCode()).isNotEqualTo(three.hashCode());

        one.setRe(2.0);
        one.setIm(2.0);

        assertThat(one.equals(one)).isTrue();
        assertThat(one.equals(two)).isFalse();
        assertThat(one.equals(three)).isTrue();

        assertThat(one.hashCode()).isEqualTo(one.hashCode());
        assertThat(one.hashCode()).isNotEqualTo(two.hashCode());
        assertThat(one.hashCode()).isEqualTo(three.hashCode());

    }
}