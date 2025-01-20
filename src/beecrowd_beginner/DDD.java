package beecrowd_beginner;
import java.util.Scanner;

public class DDD {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        int ddd = reader.nextInt();

        if (ddd == 61){

            System.out.printf("Brasilia\n");

        } else if (ddd == 71) {

            System.out.printf("Salvador\n");

        } else if (ddd == 11) {

            System.out.printf("Sao Paulo\n");

        } else if (ddd == 21) {

            System.out.printf("Rio de Janeiro\n");
            
        } else if (ddd == 32) {

            System.out.printf("Juiz de Fora\n");

        } else if (ddd == 19) {

            System.out.printf("Campinas\n");

        } else if (ddd == 27){

            System.out.printf("Vitoria\n");

        } else if (ddd == 31) {

            System.out.printf("Belo Horizonte\n");

        } else {

            System.out.printf("DDD nao cadastrado\n");
        }

    }
}
