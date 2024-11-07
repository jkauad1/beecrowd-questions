package beecrowd_beginner;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double radius = reader.nextDouble();
        double pi = 3.14159;

        double calculus = (4.0/3.0 * pi) * (radius * radius * radius);

        System.out.printf("VOLUME = %.3f\n", calculus);
    }

}
