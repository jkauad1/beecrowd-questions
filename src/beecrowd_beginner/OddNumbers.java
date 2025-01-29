package beecrowd_beginner;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        int value = reader.nextInt();

        if (value >= 1) {

            for (int i = 0; i <= value; i++) {

                if (i % 2 != 0){

                    System.out.printf("%d\n", i);

                }
            }
        }

    }
}
