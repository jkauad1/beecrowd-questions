package beecrowd_beginner;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int seconds = reader.nextInt();

        int hours = seconds / 3600;
        seconds = seconds - (hours * 3600);
        int minutes = seconds / 60;
        seconds = seconds - (minutes * 60);

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
