package com.pluralsight.financialcalculators;

import java.util.Scanner;

public class Mortgage {


    public static double costMortgage(double principle, double interestRate, double loanTerm) {
        double interest = interestRate / 100;
        double numerator = principle * interest /12;
        double exp = -loanTerm * 12;
        double value = 1 + interest /12;
        double denominator = 1 - Math.pow(value, exp);
        return numerator/denominator;
    }
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print(" Welcome, please tell us how much you would like to borrow?: ");
        double principle = inputScanner.nextDouble();
        inputScanner.nextLine();

        System.out.print(" How long will you be paying back the borrowed amount in years?: ");
        double loanTerm = inputScanner.nextDouble();
        inputScanner.nextLine();

        System.out.print("And with this amount of interest: ");
        double interestRate = inputScanner.nextDouble();
        inputScanner.nextLine();

        System.out.print("Over the course of your loan, your total payment per month will be: ");
        double monthlyPayment = costMortgage(principle, interestRate, loanTerm);
        System.out.println(monthlyPayment);

    }
}