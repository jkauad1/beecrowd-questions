package beecrowd_beginner;
import java.util.Scanner;

public class SimpleSort {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        int number3 = reader.nextInt();

        /*            nice try
        int highest = number1;
        int middle = number2;
        int lowest = number3;

        if (number2 > highest){
            highest = number2;
            middle = number1;
        }
        if (number3 > highest){
            highest = number3;
            middle = number2;
            lowest = number1;
        }

        System.out.println(lowest);
        System.out.println(middle);
        System.out.println(highest);
        */

        if (number1 < number2 && number1 < number3){

            System.out.printf("%d\n", number1);

            if (number2 < number3){

                System.out.printf("%d\n", number2);
                System.out.printf("%d\n", number3);

            } else {

                System.out.printf("%d\n", number3);
                System.out.printf("%d\n", number2);

            }
        } else if (number2 < number1 && number2 < number3) {

            System.out.printf("%d\n", number2);

            if (number1 < number3){
                System.out.printf("%d\n", number1);
                System.out.printf("%d\n", number3);

            } else {

                System.out.printf("%d\n", number3);
                System.out.printf("%d\n", number1);

            }
        } else {

            System.out.printf("%d\n", number3);

            if (number1 < number2){
                System.out.printf("%d\n", number1);
                System.out.printf("%d\n", number2);
            } else {
                System.out.printf("%d\n", number2);
                System.out.printf("%d\n", number1);
            }
        }


        System.out.print("\n");

        System.out.printf("%d\n", number1);
        System.out.printf("%d\n", number2);
        System.out.printf("%d\n", number3);

    }
}
