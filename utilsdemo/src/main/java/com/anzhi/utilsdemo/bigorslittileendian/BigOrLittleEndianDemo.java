package com.anzhi.utilsdemo.bigorslittileendian;

/*
* 需要使用 jdk8 编译，才能找到 sun.misc.Unsafe 这个类
* jdk11 限制了部分权限使用
* */
//import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class BigOrLittleEndianDemo {
//    public static Unsafe reflectGetUnsafe() {
//        try {
//            Field field = Unsafe.class.getDeclaredField("theUnsafe");
//            field.setAccessible(true);
//            return (Unsafe) field.get(null);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
