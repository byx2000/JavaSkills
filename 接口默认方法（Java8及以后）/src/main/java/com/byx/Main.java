package com.byx;

public class Main
{
    public static void main(String[] args)
    {
        Runnable runnable = new RunAndFly();
        runnable.run();

        Flyable flyable = new RunAndFly();
        flyable.fly();
    }
}
