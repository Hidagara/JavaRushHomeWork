package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by hidagara on 08.04.2016.
 */
public class Singleton
{

    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance()
    {

        return  instance;
    }

    private Singleton ()
    {

    }
}
