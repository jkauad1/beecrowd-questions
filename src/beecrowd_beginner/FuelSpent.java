package beecrowd_beginner;
import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int spentTime = reader.nextInt();
        int avgSpeed = reader.nextInt();

        float distance = spentTime * avgSpeed;

        float calculus = distance / 12;

        System.out.printf("%.3f%n", calculus);
    }

}
