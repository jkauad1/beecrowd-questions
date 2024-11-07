package beecrowd_beginner;

import java.util.Scanner;

public class AgeInDay {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int ageInDays = reader.nextInt();

        int ageInYears = ageInDays / 365;

        ageInDays = ageInDays - (ageInYears * 365);

        int ageInMonths = ageInDays / 30;

        ageInDays = ageInDays - (ageInMonths * 30);

        System.out.println(ageInYears + " ano(s)");
        System.out.println(ageInMonths + " mes(es)");
        System.out.println(ageInDays + " dia(s)");
    }
}
