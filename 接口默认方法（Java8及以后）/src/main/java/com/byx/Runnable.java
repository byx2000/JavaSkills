package com.byx;

public interface Runnable
{
    default void run()
    {
        System.out.println("default run");
    }
}
