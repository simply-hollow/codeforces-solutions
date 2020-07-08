import java.util.*;

public class cheap_travel{
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		int n= src.nextInt();
		int m= src.nextInt();
		int a= src.nextInt();
		int b= src.nextInt();

		float pr1=(Float.valueOf(b))/(Float.valueOf(m));
		float pr2= Float.valueOf(a);
		//System.out.println(pr1 + " " + pr2);

		if(pr1==pr2)
			System.out.println(n*a);
		else if(pr1<pr2){
			System.out.println((n/m)*b + (n%m)*a);
		}
		else
			System.out.println(n*a);
	}
}