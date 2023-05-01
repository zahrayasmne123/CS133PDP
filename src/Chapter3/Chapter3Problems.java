package Chapter3;
import java.util.Scanner;
import java.util.*;

public class Chapter3Problems {
    public static void main(String[] args){

        //question 3
        try {
            Scanner question3 = new Scanner(System.in);
            String[] rainbow = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
            System.out.println("number");
            int num = question3.nextInt();
            if (num < rainbow.length)
                System.out.println(rainbow[num]);
            else
                throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException ex){
            System.out.println("out of bounds");
        }


        //question 8
        Scanner question8 = new Scanner(System.in);
        int one = question8.nextInt();
        int two = question8.nextInt();
        int three = question8.nextInt();
        int[] array = {one, two, three};
        System.out.println(sortQuestion8(array));



        //question 15
        Scanner randomNum = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = randomNum.nextInt();
        int[] numbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("The generated array is:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }


        //question 28
        System.out.println("Enter x1,x2,y1 and y2 ");
        Scanner reader = new Scanner(System.in);
        float x1 = reader.nextFloat();
        float x2 = reader.nextFloat();
        float y1 = reader.nextFloat();
        float y2 = reader.nextFloat();

        if (y1 < x1 || y2 < x2)
            System.out.println("there is an overlap ");
        else
            System.out.println("no overlap");


    }

    public static int[] sortQuestion8(int[] arr){
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i-1] < arr[i]) {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return arr;
    }

}
