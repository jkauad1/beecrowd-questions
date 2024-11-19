package beecrowd_beginner;

import java.util.Scanner;

public class Snack {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        int x = reader.nextInt();
        int y = reader.nextInt();

        if (x == 1){
            {
                System.out.printf("Total: R$ %.2f%n", 4.00 * y );
            }
        } else if (x == 2) {
            System.out.printf("Total: R$ %.2f%n", 4.50 * y);
        } else if (x == 3) {
            System.out.printf("Total: R$ %.2f%n", 5.00 * y);
        } else if (x == 4) {
            System.out.printf("Total: R$ %.2f%n", 2.00 * y);
        } else if (x == 5) {
            System.out.printf("Total: R$ %.2f%n", 1.50 * y);
        }
    }
}
