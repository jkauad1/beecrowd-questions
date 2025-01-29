package beecrowd_beginner;

import java.util.Scanner;

public class SixOddNumbers {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        int value = reader.nextInt();
        int oddQuantity = 0;

        while (oddQuantity < 6) {

            if (value % 2 != 0){
                System.out.printf("%d\n", value);
                oddQuantity++;
            }
            value++;
        }
    }
}
