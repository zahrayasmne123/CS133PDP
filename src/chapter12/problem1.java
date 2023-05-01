package chapter12;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a sum");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        /**
        try {
            if (input.hasNextInt()) {
                num1 = input.nextInt();
                num2 = input.nextInt();
            }
            else{
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException exception){
            System.out.println("not an integer");

        }
         **/

        String operation = input.next();
        try {
            switch (operation) {
                case "+" -> System.out.println(num1 + num2);
                case "-" -> System.out.println(num1 - num2);
                case "/" -> System.out.println(num1 / num2);
                case "*" -> System.out.println(num1 * num2);
                default -> throw new IllegalArgumentException("invalid operator" + operation);
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("wrong operand");

        }


    }
}




