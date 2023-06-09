package com.anzhi.utilsdemo.reflectiondemo;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

    // 验证 -parameters 参数的作用，
    // 在 idea 中设置编译器 Java Compiler 的编译参数，添加 -parameters
    public static void main(String[] args) {
        Method[] methods = ReflectionDemo.class.getMethods();
        for (Method method : methods) {
            if ("parameterMethodTest".equals(method.getName())) {
                Parameter[] parameters = method.getParameters();
                for (Parameter parameter : parameters) {
                    System.out.println(parameter.getName());
                }
            }
        }
    }

    public static void parameterMethodTest(int paramOne, String paramTwo, int paramThird) {
        System.out.println("test parameters");
    }
}
