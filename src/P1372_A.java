import java.io.*;
import java.util.*;

public class P1372_A{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();

		while(t-- > 0){
			int n= sc.nextInt();
			int arr[]= new int[n];

			for(int i=0; i<n; i++)
				arr[i]=1;

			for(int i=0; i<n; i++)
				System.out.print(arr[i]+" ");	
			System.out.println();
		}
	}
}