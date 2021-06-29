package com.ironhack;

public class MathLibrary {

    public static int multiply(int a, int b){
        int product = a * b;
         if(product / a != b){
             throw new IllegalArgumentException("Product of input is too large for int");
         }
         return a*b;
    }
}
