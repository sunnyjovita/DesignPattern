package com.proxy;

public class OperationsObjectProxy extends OperationsImplementation{
    public void delete() 
    {
        System.out.println("Starting proxy");
        super.delete();
    }
}