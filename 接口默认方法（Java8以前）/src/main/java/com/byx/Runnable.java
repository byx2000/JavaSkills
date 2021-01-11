package com.byx;

public interface Runnable
{
    void run();

    Runnable defaultImpl = new Runnable()
    {
        @Override
        public void run()
        {
            System.out.println("default run");
        }
    };
}
