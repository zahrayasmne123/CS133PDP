package chapter4;
import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hex = input.nextLine().toUpperCase();

        if (hex.length() != 1 || !Character.isDigit(hex.charAt(0)) && (hex.charAt(0) < 'A' || hex.charAt(0) > 'F')) {
            System.out.println("Invalid input.");
        } else {
            int decimal = Character.isDigit(hex.charAt(0)) ? hex.charAt(0) - '0' : hex.charAt(0) - 'A' + 10;
            String binary = Integer.toBinaryString(decimal);

            System.out.println("The binary value is " + binary);
        }

        input.close();
    }
}
