import java.io.IOException;
import java.util.Scanner;

public class HighestAndPosition {
 
    public static void main(String[] args) throws IOException {
 
        Scanner reader = new Scanner(System.in);
        
        int maior = 0;
        int position = 0;
        
        for (int i = 0; i < 100; i++){
            
            int number = reader.nextInt();
            
            if (number > maior) {
                
                maior = number;
                position = i + 1;
                
            }
        }
        
        System.out.printf("%d\n%d\n", maior, position);
 
    }
 
}
