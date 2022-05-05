package lesson_one.primitive;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimitiveTest {

    @Test
    public void testSumInteger() {
        assertThat(Primitive.sum(1, 2)).isEqualTo(3);
        assertThat(Primitive.sum(123123, 123123)).isEqualTo(246246);
        assertThat(Primitive.sum(-100, 100)).isZero();
        assertThat(Primitive.sum(1, 999999999)).isEqualTo(1000000000);
    }

    @Test
    public void testSumDouble() {
        assertThat(Primitive.sub(1.00001D, 2.1D)).isEqualTo(-1.09999D);
        assertThat(Primitive.sub(-0.01D, 0.001)).isEqualTo(-0.011);
    }

    @Test
    public void testSumNumber() {
        assertThat(Primitive.sumNumber(1.23, 5.32)).isEqualTo(6);
        assertThat(Primitive.sumNumber(-3.01D, -5.001)).isEqualTo(-8);
        assertThat(Primitive.sumNumber(2.9, 2.1)).isEqualTo(5);
    }

    @Test
    public void testIsEven() {
        assertThat(Primitive.isEven(1)).isFalse();
        assertThat(Primitive.isEven(100)).isTrue();
        assertThat(Primitive.isEven(-12)).isTrue();
        assertThat(Primitive.isEven(333)).isFalse();
    }

    @Test
    public void testSymbol() {
        assertThat(Primitive.symbol(99)).isEqualTo('¿');
        assertThat(Primitive.symbol(122)).isEqualTo('Ö');
        assertThat(Primitive.symbol(32)).isEqualTo('|');
        assertThat(Primitive.symbol(0)).isEqualTo('\\');
    }

    @Test
    public void testLastNumber() {
        assertThat(Primitive.lastNumber(123)).isEqualTo(3);
        assertThat(Primitive.lastNumber(1000000)).isZero();
        assertThat(Primitive.lastNumber(-1)).isEqualTo(-1);
        assertThat(Primitive.lastNumber(12356789)).isEqualTo(9);
    }

    @Test
    public void testSumExpression() {
        assertThat(Primitive.sumExpression(123)).isEqualTo(6);
        assertThat(Primitive.sumExpression(999)).isEqualTo(27);
        assertThat(Primitive.sumExpression(101)).isEqualTo(2);
    }

    @Test
    public void testDoubleExpression() {
        assertThat(Primitive.doubleExpression(0.1, 0.2, 0.3)).isTrue();
        assertThat(Primitive.doubleExpression(0.5, 0.2, 0.9)).isFalse();
    }

    @Test
    public void testBooleanExpression() {
        assertThat(Primitive.booleanExpression(true, true, true, true)).isFalse();
        assertThat(Primitive.booleanExpression(false, false, false, false)).isFalse();
        assertThat(Primitive.booleanExpression(true, false, false, true)).isTrue();
        assertThat(Primitive.booleanExpression(false, true, true, false)).isTrue();
        assertThat(Primitive.booleanExpression(true, false, true , true)).isFalse();
    }

}