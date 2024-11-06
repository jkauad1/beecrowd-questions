package beecrowd_beginner;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        //level 2 question at beecrowd

        Scanner leitor = new Scanner(System.in);

        int number = leitor.nextInt();
        int hours = leitor.nextInt();
        float perHour = leitor.nextFloat();

        float salary = perHour * hours;

        System.out.print("NUMBER" + " = " + number + "\n");
        // Usando printf para formatar o salário com uma casa decimal sem quebra de linha
        System.out.printf("SALARY =U$ %.1f", salary);
    }

}