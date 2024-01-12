
    
import java.util.Scanner;
public class Iteration_Condtion_AlgoProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n = sc.nextInt();
        int c = 0;
        int p = n;
        while (n != 0) {
            c = c + 1;
            n = n / 10;
        }
        System.out.println("No of digits in " + p + " are: " + c);
        sc.close();
    }
}

