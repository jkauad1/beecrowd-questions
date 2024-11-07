package beecrowd_beginner;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int km = reader.nextInt();
        float usedFuel = reader.nextFloat();

        float avgConsumption = km / usedFuel;

        System.out.printf("%.3f %s%n", avgConsumption, "km/l");

    }
}
