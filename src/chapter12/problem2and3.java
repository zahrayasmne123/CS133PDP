package chapter12;
import java.util.InputMismatchException;
import java.util.Scanner;


public class problem2and3 {
    public static void main(String[] args) {
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner input = new Scanner(System.in);

        int month = 0;
        System.out.println("input a number");
        try {
            if (input.hasNextInt()) {
                month = input.nextInt();
                month--;
            } else {
                throw new InputMismatchException();
            }
        }
        catch(InputMismatchException ex){
            System.out.println("not a number");
            System.exit(0);
        }

        try {
                if (month<=months.length) {
                    System.out.println(months[month]);
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }

        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("choose an number from 1-12");
        }

    }
}

