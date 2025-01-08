package beecrowd_beginner;
import java.util.Scanner;

public class GameTimeWithMinutes {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int startHour = reader.nextInt();
        int startMinute = reader.nextInt();
        int endHour = reader.nextInt();
        int endMinute = reader.nextInt();


        int gameTimeMinutes = endMinute - startMinute;
        int gameTimeHours = endHour - startHour;

        if (gameTimeMinutes < 0) {

            gameTimeMinutes += 60;
            gameTimeHours--;

        }

        if (gameTimeHours < 0) {

            gameTimeHours += 24;

        }

        if (startHour == endHour && startMinute == endMinute) {

            gameTimeHours = 24;
            gameTimeMinutes = 0;

        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", gameTimeHours, gameTimeMinutes);

    }
}
