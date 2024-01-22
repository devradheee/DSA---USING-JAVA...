import java.util.Scanner;

public class DSA_Array_Insertion1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value to be inserted:");
		int value=sc.nextInt();
		
		//Insertion at End of array
		int []newArr=new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i]=arr[i];
		}
		newArr[newArr.length-1]=value;
		
		arr=newArr;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}