package chapter5;
import java.util.Scanner;
public class ExamPassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Java score: ");
        int score = input.nextInt();

        if (score >= 60) {
            System.out.println("You pass the exam.");
        } else {
            System.out.println("You don't pass the exam.");
        }

        input.close();
    }
}
