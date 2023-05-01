package chapter4;
import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length from centre to edge");
        int input = scanner.nextInt();
        double area = (5 * input * input) / 4 * Math.tan(Math.PI / 5);
        System.out.println("area");

    }


}
