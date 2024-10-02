package com.pluralsight.annuitycalc;

//present value formula: PV = C * ((1 + r)^t - 1 /r)
//C = Cashflow
//PV = PresentValue
//r = interest
//t = timePeriod


import java.util.Scanner;

public class Annuity {

    public static double annuityValue(double monthlyPayout, double interestRate, double amountofYears) {
        double monthlyinterest = (interestRate / 100) / 12; //interest rate per month in a year
        double amountofMonths = amountofYears * 12; //amount of months in each year
        double numerator = Math.pow(1 + monthlyinterest, amountofMonths) - 1;
        double denominator = monthlyinterest;

        //double presentValue = monthlyPayout * (numerator/denominator)*(monthlyPayout/amountofYears);
        //PV Annuity = (Annuity/r) (1-(1/(1+r)^t) )
        //Annuity = monthlyPayout
        //r = monthlyinterest
        //t = amountofmonths

        double presentValue = (monthlyPayout/monthlyinterest) * (1 - (1 / Math.pow(1 + monthlyinterest, amountofMonths)));
        //annuity/interest rate per month in a year




        return presentValue;
        //PV = C * ((1 + r)^t - 1/r)
        //PV = P * (1 -(1 + r/12)^t) / r/n
    }
public static void main(String[] args) {

    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Hello, how much are you going to be paying monthly?: ");
    double monthlyPayout = inputScanner.nextDouble();

    System.out.print("How much interest are you willing to deal with?: ");
    double interest = inputScanner.nextDouble();

    System.out.print("In years, please put how long you would want it to be.: ");
    double amountofTime = inputScanner.nextDouble();

    System.out.print("Congrats, your amount of investment requires a total of: ");
    double presentValue = annuityValue(monthlyPayout, interest, amountofTime);
    System.out.println(presentValue);




    }





}
