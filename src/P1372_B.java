import java.io.*;
import java.util.*;

public class P1372_B{
//	static int max= 100000005;
//	public static void sieveOfEratosthenes(boolean prime[]){
//		for(int i=0; i<max; i++)
//			prime[i]= true;
//
//		for(int i=2; i*i<=max; i++){
//			if(prime[i]==true){
//				for(int j=i*i; j<=max; j+=i)
//					prime[i]=false;
//			}
//		}
//	}

//	public static boolean isPrime(int n){
//		int flag=0;
//		for(int i=2; i<=Math.sqrt(n); i++)
//			if(n%i==0){
//				flag=1;
//				break;
//			}

//		if(flag==1 || n!=2)
//			return false;
//		return true;
//	}

	public static int smallestFactor(int n){

		for(int i=2; i<=Math.sqrt(n); i++)
			if(n%i==0)
				return i;

		return 1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();

		while(t-- > 0){
			int n= sc.nextInt();

			int p= smallestFactor(n);
			if(p==1)
				System.out.println(1 + " " + (n-1));
			else
				System.out.println(n/p + " " + (n-(n/p)));
		}
	}
}
