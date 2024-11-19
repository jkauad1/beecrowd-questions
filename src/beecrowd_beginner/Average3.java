package beecrowd_beginner;

import java.util.Scanner;

public class Average3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        float number1 = reader.nextFloat() * 2;
        float number2 = reader.nextFloat() * 3;
        float number3 = reader.nextFloat() * 4;
        float number4 = reader.nextFloat();

        float sum = number1 + number2 + number3 + number4;
        float weightSum = 2 + 3 + 4 + 1;

        float media = sum / weightSum;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7) {
            System.out.printf("Aluno aprovado.%n");
        } else if (media < 5) {
            System.out.printf("Aluno reprovado.%n");
        } else {
            System.out.printf("Aluno em exame.%n");

            float examGrade = reader.nextFloat();
            media = (examGrade + media) / 2;

            System.out.printf("Nota do exame: %.1f%n", examGrade);

            if (media >= 5){
                System.out.printf("Aluno aprovado.%n");
                System.out.printf("Media final: %.1f%n", media);
            } else {
                System.out.printf("Aluno reprovado.%n");
                System.out.printf("Media final: %.1f%n", media);
            }
        }
    }
}
