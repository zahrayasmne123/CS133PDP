package Chapter1;


public class Chapter1Problems {

    public static void main(String[] args) {

        //question 1
        System.out.println("Welcome to java");
        System.out.println("learning java now");


        //question 2
        String question2 = "I love java";
        for (int i = 0; i < 5; i++) {
            System.out.println(question2);
        }

        //question 4
        String table[][] = {{"a", "a^2", "a^3", "a4"}, {"1", "1", "1", "1"}, {"2", "4", "8", "16"}};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        //question 8
        double radius = 6.5;
        double pi = 3.14159;
        double perimeter = 2 * radius * pi;
        double area = pi * radius * radius;

        System.out.println(area);
        System.out.println(perimeter);


        //question 11
        int population = 312032486;
        int days = 365;

        int birthsPerYear= perYear(perDay(7));
        int deathsPerDay = perYear(perDay(13));
        int immigrantsPerDay = perYear(perDay(45));

        population += ((birthsPerYear+deathsPerDay+immigrantsPerDay)*5);
        System.out.println(population);




    }

    private static int perDay(int n){
        return (24*60*60)/n;
    }

    private static int perYear(int n){
        return 365*n;
    }
}


