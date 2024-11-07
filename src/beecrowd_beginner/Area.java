package beecrowd_beginner;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double valueA = reader.nextDouble();
        double valueB = reader.nextDouble();
        double valueC = reader.nextDouble();

        double triangle = valueA * valueC / 2;
        double circle =  3.14159 * (valueC * valueC);
        double trapezium = ((valueA + valueB) * valueC) / 2;
        double square = valueB * valueB;
        double rectangle = valueA * valueB;

        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);
    }
}
