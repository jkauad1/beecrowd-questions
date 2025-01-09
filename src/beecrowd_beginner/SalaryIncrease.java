package beecrowd_beginner;
import java.util.Scanner;

public class SalaryIncrease {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        double salary = reader.nextDouble();
        double readjustment;
        int percentual;

        if (salary >= 0 && salary <= 400) {
            percentual = 15;
            readjustment = salary * percentual / 100.0;
        } else if (salary <= 800) {
            percentual = 12;
            readjustment = salary * percentual / 100.0;
        } else if (salary <= 1200) {
            percentual = 10;
            readjustment = salary * percentual / 100.0;
        } else if (salary <= 2000) {
            percentual = 7;
            readjustment = salary * percentual / 100.0;
        } else {
            percentual = 4;
            readjustment = salary * percentual / 100.0;
        }

        salary += readjustment;

        System.out.printf("Novo salario: %.2f\n", salary);
        System.out.printf("Reajuste ganho: %.2f\n", readjustment);
        System.out.printf("Em percentual: %d %%\n", percentual);

    }
}
