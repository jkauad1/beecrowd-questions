package beecrowd_beginner;

import java.util.Scanner;

public class BankNotes {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int value = reader.nextInt();

        System.out.println(value);

        int notasDe100 = value / 100;
        value = value - (notasDe100 * 100);
        int notasDe50 = value / 50;
        value = value - (notasDe50 *50);
        int notasDe20 = value / 20;
        value = value - (notasDe20 * 20);
        int notasDe10 = value / 10;
        value = value - (notasDe10 * 10);
        int notasDe5 = value / 5;
        value = value - (notasDe5 * 5);
        int notasDe2 = value / 2;
        value = value - (notasDe2 * 2);
        int notasDe1 = value / 1;


        System.out.printf("%d nota(s) de R$ %s\n", notasDe100, "100,00");
        System.out.printf("%d nota(s) de R$ %s\n", notasDe50, "50,00");
        System.out.printf("%d nota(s) de R$ %s\n", notasDe20, "20,00");
        System.out.printf("%d nota(s) de R$ %s\n", notasDe10, "10,00");
        System.out.printf("%d nota(s) de R$ %s\n", notasDe5, "5,00");
        System.out.printf("%d nota(s) de R$ %s\n", notasDe2, "2,00");
        System.out.printf("%d nota(s) de R$ %s\n", notasDe1, "1,00");
    }



}
