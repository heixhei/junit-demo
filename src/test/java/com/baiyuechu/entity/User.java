package com.baiyuechu.entity;

import com.baiyuechu.annotaton.MyAnnotation;

public class User {
    @MyAnnotation
    public void printUsername() {
        System.out.println("小明");
    }
}
