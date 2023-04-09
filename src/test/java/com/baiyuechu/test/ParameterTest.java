package com.baiyuechu.test;

import com.baiyuechu.entity.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class ParameterTest {
    private static Calculator calculator = new Calculator();
    private int a;
    private int b;
    private int result;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {Integer.MAX_VALUE, 2, 0},
        });
    }

    /**
     * 构造函数，对变量初始化
     */
    public ParameterTest(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Test
    public void testadd() {
//        Calculator calculator1 = new Calculator();
        System.out.println(calculator.add(a, b));
        Assert.assertEquals(result, calculator.add(a, b));
    }
}
