package beecrowd_beginner;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        int number3 = reader.nextInt();

        int greatestAB = (number1 + number2 + Math.abs(number1 - number2)) / 2;

        int greatest = (greatestAB + number3 + Math.abs(greatestAB - number3)) / 2;

        System.out.println(greatest + " eh o maior");
    }
}
