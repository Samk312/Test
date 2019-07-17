package com.training.day14.exceptions;
class A
{
    static int i=10;
 
    static
    {
    	System.out.println("Static of A");
        i++;
    }
 
    {
    	System.out.println("Non - Static of A");
        ++i;
    }
}