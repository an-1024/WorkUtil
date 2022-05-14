package com.anzhi.utilsdemo.jsondemo;

import java.util.Objects;

public interface ValueEnum<T> {
    T getCode();

    default boolean valueEqual(T value) {
        return Objects.equals(this.getCode(), value);
    }
}