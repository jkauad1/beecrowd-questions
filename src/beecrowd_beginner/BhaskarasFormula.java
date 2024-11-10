package beecrowd_beginner;

import java.util.Scanner;

public class BhaskarasFormula {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double A = reader.nextDouble();
        double B = reader.nextDouble();
        double C = reader.nextDouble();

        double discriminant = B * B - 4 * A * C;

        if (discriminant > 0 && A > 0 && B > 0 && C > 0){
            double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);

            System.out.printf("R1 = %.5f%n", root1);
            System.out.printf("R2 = %.5f%n", root2);
        } else{
            System.out.println("Impossivel calcular");
        }
    }
}
