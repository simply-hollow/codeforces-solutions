import java.io.*;
import java.util.*;

public class P1380_A{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();

		while(t-- > 0){
			int n= sc.nextInt();
			int arr[]= new int[n];
			int flag=0;
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();

			for(int i=0; i<=n-3; i++){
				if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
					System.out.println("YES");
					System.out.println((i+1)+" "+(i+2)+" "+(i+3));
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("NO");
		}
	}
}