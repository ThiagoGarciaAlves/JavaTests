package utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    MathUtils mathUtils;

    public MathUtilsTest() {
        mathUtils = new MathUtils();
    }

    @Test
    public void additionTest001() {
        assertEquals(2, mathUtils.addition(1, 1));
    }

    @Test
    public void additionTest002() {
        assertEquals(4, mathUtils.addition(2, 2));
    }

    @Test
    public void additionTest003() {
        assertEquals(30, mathUtils.addition(15, 15));
    }

    @Test
    public void subtractionTest001() {
        assertEquals(0, mathUtils.subtraction(2, 2));
    }

    @Test
    public void subtractionTest002() {
        assertEquals(-50, mathUtils.subtraction(50, 100));
    }

    @Test
    public void subtractionTest003() {
        assertEquals(0, mathUtils.subtraction(-100, -100));
    }

    @Test
    public void multiplicationTest001() {
        assertEquals(0, mathUtils.multiplication(0, 0));
    }

    @Test
    public void multiplicationTest002() {
        assertEquals(1, mathUtils.multiplication(1, 1));
    }

    @Test
    public void multiplicationTest003() {
        assertEquals(4, mathUtils.multiplication(2, 2));
    }

    @Test
    public void divisionTest001() {
        assertEquals(Double.POSITIVE_INFINITY, mathUtils.division(1, 0), 0);
    }

    @Test
    public void divisionTest002() {
        assertEquals(0, mathUtils.division(0, 1), 0);
    }

    @Test
    public void divisionTest003() {
        assertEquals(1, mathUtils.division(1, 1), 0);
    }

    @Test
    public void divisionTest004() {
        assertEquals(0.5, mathUtils.division(1, 2), 0);
    }

    @Test
    public void divisionTest005() {
        assertEquals(0.333, mathUtils.division(1, 3), 0.001);
    }

    @Test
    public void divisionTest006() {
        assertEquals(2, mathUtils.division(2, 1), 0);
    }

    @Test
    public void divisionTest007() {
        assertEquals(1, mathUtils.division(2, 2), 0);
    }

}
