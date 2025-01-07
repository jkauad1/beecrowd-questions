package beecrowd_beginner;
import java.util.Scanner;

public class TriangleTypes {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        double a = reader.nextDouble();
        double b = reader.nextDouble();
        double c = reader.nextDouble();

        if (a < b){

            double aux = a;
            a = b;
            b = aux;

        }

        if (a < c){

            double aux = a;
            a = c;
            c = aux;

        }

        if (b < c){

            double aux = b;
            b = c;
            c = aux;

        }

        if (a >= b + c){

            System.out.printf("NAO FORMA TRIANGULO\n");

        } else {
            if ((a * a) == (b * b) + (c * c)) {

                System.out.printf("TRIANGULO RETANGULO\n");

            }

            if ((a * a) > (b * b) + (c * c)) {

                System.out.printf("TRIANGULO OBTUSANGULO\n");

            }

            if ((a * a) < (b * b) + (c * c)) {

                System.out.printf("TRIANGULO ACUTANGULO\n");

            }

            if (a == b && a == c) {

                System.out.printf("TRIANGULO EQUILATERO\n");

            }

            if (a == b && b != c || b == c && b != a || a == c && a != b) {

                System.out.printf("TRIANGULO ISOSCELES\n");

            }
        }

    }
}
