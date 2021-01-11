package com.byx;

public interface Flyable
{
    default void fly()
    {
        System.out.println("default fly");
    }
}
