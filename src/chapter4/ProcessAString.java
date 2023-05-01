package chapter4;
import java.util.Scanner;

public class ProcessAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int length = str.length();
        char lastChar = str.charAt(length - 1);

        System.out.println("The length of the string is " + length);
        System.out.println("The last character of the string is " + lastChar);

        input.close();
    }
}
