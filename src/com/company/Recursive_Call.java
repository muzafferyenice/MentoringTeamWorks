package com.company;

import static java.lang.Integer.parseInt;

public class Recursive_Call {
    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n - 1); // recursive call
        else
            return 1;


    }

    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));
    }
}

