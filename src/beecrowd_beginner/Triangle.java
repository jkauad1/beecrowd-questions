package beecrowd_beginner;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        double a = reader.nextDouble();
        double b = reader.nextDouble();
        double c = reader.nextDouble();

        if (a +  b > c && a + c > b && b + c > a){

            System.out.printf("Perimetro = %.1f\n", a + b + c);

        } else {

            System.out.printf("Area %.1f\n", ((a + b) * c) / 2.0);

        }


    }
}
