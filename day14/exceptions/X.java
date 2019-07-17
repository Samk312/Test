package com.training.day14.exceptions;
class X extends A
{
    static
    {
    	System.out.println("Static Block of X");
        Y.methodOfY();
    }
}