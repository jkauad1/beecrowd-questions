package beecrowd_beginner;
import java.util.Scanner;

public class Multiples {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.printf("Sao Multiplos\n");
        } else {
            System.out.printf("Nao sao Multiplos\n");
        }

    }
}
