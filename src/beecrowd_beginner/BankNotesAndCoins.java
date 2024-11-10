package beecrowd_beginner;

import java.util.Scanner;

public class BankNotesAndCoins {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        float money = reader.nextFloat();

        int notes100 = (int) (money / 100);
        money = money % 100;

        int notes50 = (int) (money / 50);
        money = money % 50;

        int notes20 = (int) (money / 20);
        money = money % 20;

        int notes10 = (int) (money / 10);
        money = money % 10;

        int notes5 = (int) (money / 5);
        money = money % 5;

        int notes2 = (int) (money / 2);
        money = money % 2;

        int moneyInCents = (int) Math.round(money * 100);

        int coin1 = moneyInCents / 100;
        moneyInCents %= 100;

        int cent50 = moneyInCents / 50;
        moneyInCents %= 50;

        int cent25 = moneyInCents / 25;
        moneyInCents %= 25;

        int cent10 = moneyInCents / 10;
        moneyInCents %= 10;

        int cent05 = moneyInCents / 5;
        moneyInCents %= 5;

        int cent01 = moneyInCents;


        System.out.println("NOTAS:");

        System.out.printf("%d nota(s) de R$ %s%n", notes100, "100.00" );
        System.out.printf("%d nota(s) de R$ %s%n", notes50, "50.00" );
        System.out.printf("%d nota(s) de R$ %s%n", notes20, "20.00" );
        System.out.printf("%d nota(s) de R$ %s%n", notes10, "10.00" );
        System.out.printf("%d nota(s) de R$ %s%n", notes5, "5.00" );
        System.out.printf("%d nota(s) de R$ %s%n", notes2, "2.00" );

        System.out.println("MOEDAS:");

        System.out.printf("%d moeda(s) de R$ %s%n", coin1, "1.00");
        System.out.printf("%d moeda(s) de R$ %s%n", cent50, "0.50");
        System.out.printf("%d moeda(s) de R$ %s%n", cent25, "0.25");
        System.out.printf("%d moeda(s) de R$ %s%n", cent10, "0.10");
        System.out.printf("%d moeda(s) de R$ %s%n", cent05, "0.05");
        System.out.printf("%d moeda(s) de R$ %s%n", cent01, "0.01");
    }
}
