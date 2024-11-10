package beecrowd_beginner;
import java.util.Scanner;

public class SelectionTest1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int A = reader.nextInt();
        int B = reader.nextInt();
        int C = reader.nextInt();
        int D = reader.nextInt();

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
