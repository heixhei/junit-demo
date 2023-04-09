package com.baiyuechu.test;

import com.baiyuechu.entity.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void Before() {
        Calculator calculator = new Calculator();
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1,calculator.subtract(3, 2));
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add(1, 2));
    }
    @Test
    public void testAddMax() {
        Calculator calculator = new Calculator();
//        Assert.assertEquals(, calculator.add(Integer.MAX_VALUE, 2));
//        assert calculator.add(Integer.MAX_VALUE, 2) > 0;
        System.out.println(calculator.add(Integer.MAX_VALUE, 2));
        Assert.assertTrue(calculator.add(Integer.MAX_VALUE, 2) > 0);
    }
    @Test
    public void testSubtract2() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(-2, calculator.subtract(3, 5));
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.divide(8, 4));
    }
    @Test(timeout = 10)
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.sum(10));
    }
    @Test(expected = ArithmeticException.class)
    public void testDivideZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.divide(5, 0));
    }
}
