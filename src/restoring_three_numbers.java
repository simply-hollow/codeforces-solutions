import java.util.*;
import java.io.*;

public class restoring_three_numbers{
	static void sort(int []arr){
		for(int i=0; i<3; i++){
			for(int j=i+1; j<=3; j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		sort(arr);
		int a=(int)(arr[0]-arr[1]+arr[2])/2;
		int b=(int)(arr[1]-arr[2]+arr[0])/2;
		int c=(int)(arr[2]-arr[0]+arr[1])/2;

		System.out.print(a+" "+b+" "+c);
		sc.close();
	}
}
