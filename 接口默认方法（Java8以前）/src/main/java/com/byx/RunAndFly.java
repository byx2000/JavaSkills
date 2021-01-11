package com.byx;

public class RunAndFly implements Runnable, Flyable
{
    @Override
    public void run()
    {
        Runnable.defaultImpl.run();
    }

    @Override
    public void fly()
    {
        Flyable.defaultImpl.fly();
    }
}
