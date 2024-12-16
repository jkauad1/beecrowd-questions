package beecrowd_beginner;

import java.util.Scanner;

public class CoordinatesOfApoint {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        float x = reader.nextFloat();

        float y = reader.nextFloat();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x == 0){
            System.out.printf("%s\n","Eixo Y");
        } else if (y == 0) {
            System.out.printf("%s\n","Eixo X");
        } else if (x > 0) {
            if (y > 0){
                System.out.printf("%s\n","Q1");
            } else {
                System.out.printf("%s\n","Q4");
            }
        }
        else {
            if (y > 0){
                System.out.printf("%s\n","Q2");
            } else {
                System.out.printf("%s\n","Q3");
            }
        }
    }
}
