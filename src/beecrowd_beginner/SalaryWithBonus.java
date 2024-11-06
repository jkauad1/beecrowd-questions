package beecrowd_beginner;
import java.util.Scanner;

public class SalaryWithBonus {

    public static void main(String[] args) {

        //https://judge.beecrowd.com/en/problems/view/1009
        //level 2 question at beecrowd
        Scanner leitor = new Scanner(System.in);

        String nome = leitor.nextLine();
        double salary = leitor.nextDouble();
        double valueSold = leitor.nextDouble();

        double aditional = valueSold * 0.15;

        System.out.printf("TOTAL = R$ %.2f", salary + aditional);
        System.out.println("");
    }
}
