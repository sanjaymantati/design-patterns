package com.designpatterns.singleton;

public class Singleton {
    private static volatile Singleton obj  = null;

    private Singleton() {}


    public void speak(){
        System.out.println("Hello There");
    }

    public static Singleton getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (Singleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}