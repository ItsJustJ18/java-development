import java.util.Scanner;

public class CD {

    public static double cdValue(double deposit, double interestRate, double maturity) {
        double interest = interestRate / 100;
        double maturityLength = maturity * 365;
        return deposit * Math.pow(1 + interest/365, maturityLength);

        //FV = PV(1 + r)^n
}
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        {

            System.out.print(" Want to find out how much your cd will be in years to come? Please input the amount you want in the deposit.: ");
            double deposit = inputScanner.nextDouble();
            //inputScanner.nextLine();

            System.out.print(" How much interest is along the cd?: ");
            double interestRate = inputScanner.nextDouble();
            //inputScanner.nextLine();

            System.out.print("And how many years do you want it to be?: ");
            double maturity = inputScanner.nextDouble();
            //inputScanner.nextLine();

            System.out.print("The total amount is: ");
            double profit = cdValue(deposit, interestRate, maturity);
            System.out.println(profit);

        }
        }
    }
