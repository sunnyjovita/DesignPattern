package com.proxy;

public class User {
    public static void main(String[] args) 
    {
        OperationsObject proxy = new OperationsObjectProxy();
        proxy.delete();
    }
}