package beecrowd_beginner;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        String hint1 = reader.nextLine();
        String hint2 = reader.nextLine();
        String hint3 = reader.nextLine();

        if (hint1.equals("vertebrado")){

            if (hint2.equals("ave")){

                if (hint3.equals("carnivoro")){

                    System.out.printf("aguia\n");

                } else {

                    System.out.printf("pomba\n");

                }

            } else {

                if (hint3.equals("onivoro")){

                    System.out.printf("homem\n");

                } else {

                    System.out.printf("vaca\n");

                }
            }
        } else {

            if (hint2.equals("inseto")){

                if (hint3.equals("hematofago")){

                    System.out.printf("pulga\n");

                } else {

                    System.out.printf("lagarta\n");

                }
            } else {

                if (hint3.equals("hematofago")){

                    System.out.printf("sanguessuga\n");

                } else {

                    System.out.printf("minhoca\n");

                }
            }
        }
    }
}
