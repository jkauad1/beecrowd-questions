package beecrowd_beginner;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double x1 = reader.nextDouble();
        double y1 = reader.nextDouble();

        double x2 = reader.nextDouble();
        double y2 = reader.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n" , distancia);

    }
}
