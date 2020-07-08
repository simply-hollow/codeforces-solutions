import java.util.*;

public class P1374_A{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();

		while(t-- > 0){
			int x= sc.nextInt();
			int y= sc.nextInt();
			int n= sc.nextInt();

			int mod= n%x;
			if(mod==y){
				System.out.println(n);
			}
			else if(mod<y){
				System.out.println(n-mod-(x-y));
			}
			else{
				System.out.println(n-(mod-y));
			}
		}
	}
}