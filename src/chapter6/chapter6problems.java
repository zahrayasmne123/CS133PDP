package chapter6;

public class chapter6problems {


    /**Write a method that computes the sum of the digits
     in an integer. Use the following method header:
     public static int sumDigits(long n)

     For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % opera-
     tor to extract digits and the / operator to remove the extracted digit. For instance,
     to extract 4 from 234, use 234 % 10 (= 4 ). To remove 4 from 234, use 234 / 10
     (= 2 3 ). Use a loop to repeatedly extract and remove the digit until all the digits
     are extracted. Write a test program that prompts the user to enter an integer then
     displays the sum of all its digits.**/
    public static int sumDigits(long n){
        int sum = 0;
        for(int i=0; i<Long.toString(n).length();i++) {
            float extracted = n % 10;
            float removed = extracted / 10;
            sum += removed;
        }
        return sum;
    }




    /**Write a method that
     computes future investment value at a given interest rate for a specified number
     of years. The future investment is determined using the formula in Programming
     Exercise 2.21.
     Use the following method header:
     public static double futureInvestmentValue(
     double investmentAmount, double monthlyInterestRate,int years)**/
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureValue;
    }

    /**Some websites impose certain rules for passwords. Write a
     method that checks whether a string is a valid password. Suppose the password
     rules are as follows:
      A password must have at least ten characters.
      A password consists of only letters and digits.
      A password must contain at least three digits.
     Write a program that prompts the user to enter a password and displays Valid
     Password if the rules are followed or Invalid Password otherwise.**/

    public static boolean isValidPassword(String password) {
        // Check password length
        if (password.length() < 10) {
            return false;
        }

        // Check that password consists of only letters and digits
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Check that password contains at least three digits
        int numDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                numDigits++;
            }
        }
        if (numDigits < 3) {
            return false;
        }

        // All checks passed
        return true;
    }

}
