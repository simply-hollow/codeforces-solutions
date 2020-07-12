import java.io.*;
import java.util.*;

public class P1372_B{
	static int max= 100000005;
	public static void sieveOfEratosthenes(boolean prime[]){
		for(int i=0; i<max; i++)
			prime[i]= true;

		for(int i=2; i*i<=max; i++){
			if(prime[i]==true){
				for(int j=i*i; j<=max; j+=i)
					prime[i]=false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		boolean prime[]= new boolean[max];

		sieveOfEratosthenes(prime);

		while(t-- > 0){
			int n= sc.nextInt();

			if(prime[n]==true){
				System.out.println(1 + " " + (n-1));
			}
			else if(n%2==0)
				System.out.println(n/2 + " " + n/2);
			else
				System.out.println(n/3 + " " + (n-(n/3)));
		}
	}
}