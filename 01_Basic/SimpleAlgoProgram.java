// Enter two numbers in keyword,
// sum two numbers....

import java.util.Scanner;
public class SimpleAlgoProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n1=sc.nextInt();
		System.out.println("Enter a No:");
		int n2=sc.nextInt();
		int s=n1+n2;
		System.out.println("Sum: "+s);
		sc.close();
	}
}