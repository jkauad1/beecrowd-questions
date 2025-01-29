package beecrowd_beginner;

import java.util.Scanner;

public class Experiments {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int number = Integer.parseInt(reader.nextLine());

        int total = 0;
        int totalC = 0;
        int totalR = 0;
        int totalS = 0;

        double percentageC = 0;
        double percentageR = 0;
        double percentageS = 0;

        for (int i = 0; i < number; i++) {

            String cases  = reader.nextLine();

            String[] casesArray = cases.split(" ");

            int amount = Integer.parseInt(casesArray[0]);

            String type = casesArray[1];

            if (amount >= 1 && amount <= 15) {

                if (type.equals("C")) {
                    totalC += amount;
                } else if (type.equals("R")) {
                    totalR += amount;
                } else if (type.equals("S")) {
                    totalS += amount;
                }

                total += amount;

            }
        }

        percentageC = ((double) totalC / total) * 100;
        percentageR = ((double) totalR / total) * 100;
        percentageS = ((double) totalS / total) * 100;

        System.out.printf("Total: %d cobaias\n" +
                "Total de coelhos: %d\n" +
                "Total de ratos: %d\n" +
                "Total de sapos: %d\n" +
                "Percentual de coelhos: %.2f %%\n" +
                "Percentual de ratos: %.2f %%\n" +
                "Percentual de sapos: %.2f %%", total, totalC, totalR, totalS, percentageC, percentageR, percentageS);

    }
}
