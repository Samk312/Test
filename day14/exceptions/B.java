package com.training.day14.exceptions;
class B extends A
{
    static
    {
    	System.out.println("Static of B");
        --i;
    }
 
    {
    	System.out.println("Non static of B");
        i--;
    }
}