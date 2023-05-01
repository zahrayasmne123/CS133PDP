package chapter4;
import java.util.Scanner;

public class LongitudeLatitude {
        public static void main(String[] args) {
            final double EARTH_RADIUS = 6371.01;

            Scanner input = new Scanner(System.in);

            System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
            double x1 = Math.toRadians(input.nextDouble());
            double y1 = Math.toRadians(input.nextDouble());

            System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
            double x2 = Math.toRadians(input.nextDouble());
            double y2 = Math.toRadians(input.nextDouble());

            double distance = EARTH_RADIUS *
                    Math.acos(Math.sin(x1) * Math.sin(x2) +
                            Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

            System.out.println("The distance between the two points is " + distance + " km.");

            input.close();
        }
    }

