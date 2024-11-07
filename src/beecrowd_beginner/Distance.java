package beecrowd_beginner;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int km = reader.nextInt();

        int calculus = km * 2;

        System.out.print(calculus + " minutos");
    }
}
