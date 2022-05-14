package com.anzhi.utilsdemo.bigorslittileendian;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class BigOrLittleEndianDemo {
    public static Unsafe reflectGetUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
