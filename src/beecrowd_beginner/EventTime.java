package beecrowd_beginner;

import java.util.Scanner;

public class EventTime {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        String startDay = reader.nextLine();
        String[] startDayParts = startDay.split(" ");

        String startHour = reader.nextLine();
        String[] startHourParts = startHour.split(" : ");

        String endingDay = reader.nextLine();
        String[] endingDayParts = endingDay.split(" ");

        String endHour = reader.nextLine();
        String[] endingHourParts = endHour.split(" : ");

        int startDays = Integer.parseInt(startDayParts[1]);
        int startHours = Integer.parseInt(startHourParts[0]);
        int startMinutes = Integer.parseInt(startHourParts[1]);
        int startSeconds = Integer.parseInt(startHourParts[2]);

        int endDays = Integer.parseInt(endingDayParts[1]);
        int endHours = Integer.parseInt(endingHourParts[0]);
        int endMinutes = Integer.parseInt(endingHourParts[1]);
        int endSeconds = Integer.parseInt(endingHourParts[2]);

        int totalSeconds = endSeconds - startSeconds;
        if (totalSeconds < 0) {

            totalSeconds += 60;
            endMinutes--;

        }

        int totalMinutes = endMinutes - startMinutes;
        if (totalMinutes < 0) {

            totalMinutes += 60;
            endHours--;
        }

        int totalHours = endHours - startHours;
        if (totalHours < 0){

            totalHours += 24;
            endDays--;

        }

        int totalDays = endDays - startDays;

        System.out.printf("%d dia(s)\n" +
                "%d hora(s)\n" +
                "%d minuto(s)\n" +
                "%d segundo(s)\n", totalDays, totalHours, totalMinutes, totalSeconds);


    }
}
