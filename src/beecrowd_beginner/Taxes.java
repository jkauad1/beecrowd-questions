package beecrowd_beginner;

import java.util.Scanner;

public class Taxes {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        double salary = reader.nextDouble();

        double tax = 0;

        if (salary <= 2000.00){

            System.out.printf("Isento\n");

        } else if (salary >= 2000.01 && salary <= 3000.00) {

            tax = (salary - 2000) * (8.0 / 100);

        } else if (salary >= 3000.01 && salary <= 4500.00) {

            tax = (1000.00 * (8.0 / 100) + (salary - 3000.01) * (18.0 / 100));

        } else {

            tax = (1000.00 * (8.0 / 100) + (1500 * (18.0 / 100) + (salary - 4500) * 28.0 / 100));

        }

         if (salary > 2000.00) {
             System.out.printf("R$ %.2f\n", tax);
         }

    }
}
