package com.baiyuechu.entity;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException e) {
            e.printStackTrace();

        }
        return 0;
    }

    public int sum(int n) {
        int sum = 0;
        int count = 1;
        while (count < n) {
            sum += count;
        }
        return sum;
    }

    public String str() {
        String str1 = null;
        return str1;
    }

}
