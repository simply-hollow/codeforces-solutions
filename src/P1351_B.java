import java.io.*;
import java.util.*;

public class P1351_B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		while(t-- >0){
			int a1=sc.nextInt();
			int b1=sc.nextInt();
			int a2=sc.nextInt();
			int b2=sc.nextInt();
			double total=(a1*b1)+(a2*b2);

			double n=Math.sqrt(total);	
			if(n*n==total)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}