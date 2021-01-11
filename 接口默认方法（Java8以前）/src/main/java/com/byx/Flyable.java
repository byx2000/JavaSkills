package com.byx;

public interface Flyable
{
    void fly();

    Flyable defaultImpl = new Flyable()
    {
        @Override
        public void fly()
        {
            System.out.println("default fly");
        }
    };
}
