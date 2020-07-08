import java.io.*;
import java.util.*;

public class P1343_0{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int n=sc.nextInt();
			int k=2;
			while(n%(Math.pow(2,k)-1)!=0)
				k++;

			int res=n/(int)(Math.pow(2,k)-1);
			System.out.println(res);
			t--;
		}
	}
}