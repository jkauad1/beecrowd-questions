package beecrowd_beginner;

import java.util.Scanner;

public class PositiveNumbers {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        double num = reader.nextDouble();
        double num2 = reader.nextDouble();
        double num3 = reader.nextDouble();
        double num4 = reader.nextDouble();
        double num5 = reader.nextDouble();
        double num6 = reader.nextDouble();

        double[] numbers = {num, num2, num3, num4, num5, num6};

        int quantity = 0;

        for (int i = 0; i < 6; i++) {

            if (numbers[i] > 0){
                quantity += 1;
            }
        }

        System.out.printf("%d valores positivos\n", quantity);

    }
}
