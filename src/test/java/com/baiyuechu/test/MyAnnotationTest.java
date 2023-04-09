package com.baiyuechu.test;

import com.baiyuechu.annotaton.MyAnnotation;
import com.baiyuechu.entity.User;
import org.junit.Test;

import java.lang.reflect.Method;

public class MyAnnotationTest {
    @Test
    public void testmyAnnotation() throws NoSuchMethodException {
        Class<?> clazz = User.class;
        Method printUsername = clazz.getMethod("printUsername");
        if (printUsername.isAnnotationPresent(MyAnnotation.class)) {
            System.out.println("检查到存在Myannotation注解");
        }
    }
}
