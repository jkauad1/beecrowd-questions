package beecrowd_beginner;
import java.util.Scanner;

public class GameTime {

    public static void main (String[] args){

        Scanner reader = new Scanner (System.in);

        int start = reader.nextInt();
        int end = reader.nextInt();

        if (start == end){

            System.out.printf("O JOGO DUROU 24 HORA(S)\n");

        } else {
            int gameTime = 0;

            if (start > end) {

                gameTime = 24 - (start - end);

            } else {

                gameTime = end - start;
            }

            System.out.printf("O JOGO DUROU %d HORA(S)\n", gameTime);
        }

    }
}
