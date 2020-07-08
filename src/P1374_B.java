import java.util.*;

public class P1374_B{

	public static boolean isOdd(int n){
		if(n%2!=0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int t= sc.nextInt();
		while(t-- > 0){
			int n= sc.nextInt();
			int count=0;
			int flag=0;
			if(n==1)
				System.out.println(0);
			else if(isOdd(n))
				System.out.println(-1);
			else{
				while(n!=1){
					if(isOdd(n)){
						System.out.println(-1);
						flag=1;
						break;
					}

					if(n%6==0){
						count++;
						n=n/6;
					}
					else if(n%2==0){
						count++;
						n=n/2;
					}
				}
				if(flag!=1)
					System.out.println(count);
			}
		}
	}
}