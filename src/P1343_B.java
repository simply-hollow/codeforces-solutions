import java.io.*;
import java.util.*;


public class P1343_B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();
		while(t-- > 0){
			int n=sc.nextInt();
			int half=n/2;
			int sum_o=0, sum_e=0, i=0;
			if(half%2!=0)
				System.out.println("NO");

			else{
				System.out.println("YES");				
				for(i=1; i<=half; i++){
					System.out.print((2*i)+" ");
					sum_e=sum_e+(2*i);
				}
				for(i=1;i<half; i++){
					System.out.print((2*i - 1)+" ");
					sum_o=sum_o+(2*i - 1);	
				}
				System.out.println(sum_e-sum_o);
			}
		}
	}
}