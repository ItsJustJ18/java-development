package com.pluralsight.donut;

// We LOVE our delimiters

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 * { } Curly braces
 *      Surround: Class declaration
 *      Array initializer
 * [ ] Square brackets
 *      Array declarations
 *      Array access
 * < > Pointy brackets
 *      Template parameter lists
 * ( ) Parentheses
 *      Parameter list for a method
 * ;   Semicolon
 *      Ends a statement
 */
import java.util.Scanner;

public class Donut
{
    static double price = .25;

    public static double getTotal(int numberofDonuts) {

        return price * numberofDonuts;




    }

    public static void main(String[] args)

    {
        //Get a scanner to read input from System.in
        Scanner inputScanner = new Scanner(System.in);

        //Prompt the user to input a number desired
        System.out.print("Welcome! How many donuts do you want? :");

        //Read the input number from the user
        int numberofDonuts = inputScanner.nextInt();
        inputScanner.nextInt();

        //Calculate the Price
        double total = getTotal(12);

        //It will print out the answer based on an input
        System.out.println("Your donuts cost:");


        System.out.println(getTotal(12) + " dollars ");
        System.out.printf("In dollars, that would be $%4.2f\n", getTotal(12));

        System.out.printf("The square root of 5 is %8.16f\n", Math.sqrt(5.0));
    }
}
