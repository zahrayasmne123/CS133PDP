package chapter5;
import java.util.Scanner;

public class FirstDayOfTheMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, etc.): ");
        int firstDayOfYear = input.nextInt();


        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        int[] firstDayOfMonth = new int[12];
        firstDayOfMonth[0] = firstDayOfYear;
        for (int i = 1; i < 12; i++) {
            int daysInPrevMonth = daysInMonth[i - 1];
            if (i == 2 && isLeapYear) {
                daysInPrevMonth++;
            }
            firstDayOfMonth[i] = (firstDayOfMonth[i - 1] + daysInPrevMonth) % 7;
        }

        for (int i = 0; i < 12; i++) {
            System.out.println(monthNames[i] + " 1, " + year + " is " + getDayName(firstDayOfMonth[i]));
        }

        input.close();
    }

    // Method to get the name of a day given its number
    public static String getDayName(int dayNumber) {
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return dayNames[dayNumber];
    }
}
