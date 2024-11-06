package beecrowd_beginner;

import java.util.Scanner;

public class SimpleCalculate {

    public static void main(String[] args) {

        //https://judge.beecrowd.com/en/problems/view/1010
        //level 3 question at beecrowd

        Scanner leitor = new Scanner(System.in);

        int productsCode1 = 0;
        int units1 = 0;
        float price1 = 0;

        productsCode1 = leitor.nextInt();
        units1 = leitor.nextInt();
        price1 = leitor.nextFloat();

        int productsCode2 = 0;
        int units2 = 0;
        float price2 = 0;

        productsCode2 = leitor.nextInt();
        units2 = leitor.nextInt();
        price2 = leitor.nextFloat();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", (units1 * price1) + (units2 * price2));
    }

}
