package com.designpatterns.Singleton;

public class Singleton {

    //use volatile -> multiple threads will able to access singleton class correctly.
    private static volatile Singleton instance;
    private String data;

    //For threading issue let's say 2 threads will access this class at the same time  , will use synchronize block to make sure , only one class may execute this code block at a given time

    private Singleton(String data){
        this.data = data;
    }

    public static Singleton getInstance(String data){

        Singleton result= instance;
        if(result== null){
            synchronized (Singleton.class) {

                if(result == null ){
                    instance = result = new Singleton(data);
                }

            }

        }
        return result;
    }

}
