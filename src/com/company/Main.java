// Create a Java Program that creates variable names for, and assigns values to the
// different Primitive Data Types. Then display each of the variables on screen, with text
// describing the type of variable that it is.

// Pseudo code
// declare a variable of type short and initialize it
// declare a variable of type int and initialize it
// declare a variable of type long and initialize it
// declare a variable of type byte and initialize it
// declare a variable of type float and initialize it
// declare a variable of type double and initialize it
// declare a variable of type char and initialize it
// declare a variable of type boolean and initialize it

// print out the variable types and example of each.

        package com.company;

public class Main {

    public static void main(String[] args) {

        // Variable creation and initializations
        short shortVariable = -32768;
        int integerVariable = 2147483647;
        long longVariable = 9223372036854775807L;
        byte byteVariable = 127;
        float floatVariable = 6.5f;
        double doubleVariable = 3.1415926539;
        char charVariable = 'g';
        boolean booleanVariable = true;

        // display the variable types and examples
        System.out.println("This is an example of a short variable 2 bytes  " + shortVariable);
        System.out.println("This is an example of an int variable 4 bytes   " + integerVariable);
        System.out.println("This is an example of a long variable 8 bytes   " + longVariable);
        System.out.println("This is an example of a byte variable 1 byte    " + byteVariable);
        System.out.println("This is an example of a float Variable 4 bytes  " + floatVariable);
        System.out.println("This is an example of a double Variable 8 bytes " + doubleVariable);
        System.out.println("This is an example of a char Variable 1 byte    " + charVariable);
        System.out.println("This is an example of a booleanVariable 1 byte  " + booleanVariable);


	    }
}
