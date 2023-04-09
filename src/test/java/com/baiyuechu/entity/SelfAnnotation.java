package com.baiyuechu.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class SelfAnnotation {
    @BeforeClass
    public void printBeforeClass() {
        System.out.println(10 * '-');
        Calculator calculator = new Calculator();
        System.out.println("BeforeClass");
        System.out.println(10 * '-');
    }

    @AfterClass
    public void printAfterClass() {
        System.out.println(10 * '-');
        System.out.println("AfterClass");
        System.out.println(10 * '-');
    }

    @Before
    public void printBefore() {
        System.out.println(10 * '-');
        System.out.println("Before");
        System.out.println(10 * '-');
    }

    @After
    public void printAfter() {
        System.out.println(10 * '-');
        System.out.println("After");
        System.out.println(10 * '-');
    }
}
