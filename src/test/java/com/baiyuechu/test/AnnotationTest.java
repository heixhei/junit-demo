package com.baiyuechu.test;

import com.baiyuechu.entity.Calculator;
import com.baiyuechu.entity.SelfAnnotation;
import org.junit.*;

public class AnnotationTest {
    @Test
    public void testAnnotation() {
        SelfAnnotation selfAnnotation = new SelfAnnotation();
        System.out.println("test");
//        selfAnnotation.printBefore();

    }
    @BeforeClass
    public static void printBeforeClass() {
//        System.out.println(10 * '-');
        Calculator calculator = new Calculator();
        System.out.println("BeforeClass");
//        System.out.println(10 * '-');
    }

    @AfterClass
    public static void printAfterClass() {
//        System.out.println(10 * '-');
        System.out.println("AfterClass");
//        System.out.println(10 * '-');
    }

    @Before
    public void printBefore() {
//        System.out.println(10 * '-');
        System.out.println("Before");
//        System.out.println(10 * '-');
    }

    @After
    public void printAfter() {
//        System.out.println(10 * '-');
        System.out.println("After");
//        System.out.println(10 * '-');
    }
}
