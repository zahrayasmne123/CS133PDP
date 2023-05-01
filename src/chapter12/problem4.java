package chapter12;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        double annualInterestRate = 0;
        int years = 0;
        double loanAmount = 0;

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("enter annual rate");
            annualInterestRate = input.nextDouble();

            System.out.println("enter then number of years (integer)");
            years = input.nextInt();

            System.out.println("enter loan amount");
            loanAmount = input.nextDouble();

            Loan loan = new Loan(annualInterestRate, years, loanAmount);

            if( annualInterestRate > 0 && years > 0 && loanAmount > 0){
                System.out.println("correct");
            }
            else{
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException ex){
            System.out.println("invalid input");}
    }
}
class Loan{
    private double annualInterestRate;
    private int nummberOfYears;
    private double loanAmount;

    public Loan(double intRate, int numYears, double loan){
        this.annualInterestRate = intRate;
        this.nummberOfYears = numYears;
        this.loanAmount = loan;
    }

}
