package Chapter2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Chapter2Problems {
    public static void main(String[] args){


        //question one
        Scanner reader = new Scanner(System.in);
        System.out.printf("Enter the driving distance" );
        int n1 = reader.nextInt();

        System.out.printf("Enter miles per gallon" );
        int n2 = reader.nextInt();

        System.out.printf("Enter price per gallon" );
        int n3 = reader.nextInt();

        int total = n2*n1 / n1;
        System.out.println(total);

        //question 2:
        Scanner question2 = new Scanner(System.in);
        double metres = question2.nextDouble();
        System.out.println(metresToFeet(metres));


        //question 5
        Scanner question5 = new Scanner(System.in);
        double cost = question5.nextDouble();
        double grat = question5.nextDouble();
        System.out.println(cost*grat);

        //question 9
        System.out.println("enter u,a,t");
        Scanner question9 = new Scanner(System.in);
        double u =  question9.nextDouble();
        double a =  question9.nextDouble();
        double t =  question9.nextDouble();
        double s = u*t + 1/2*a*t;
        System.out.println("s");
    }


    //question 2
    public static double metresToFeet(double metres){
        return metres * 3.2768;
    }
}
