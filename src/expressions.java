import java.util.*;

public class expressions{
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		
		int a= src.nextInt();
		src.nextLine();
		int b= src.nextInt();
		src.nextLine();
		int c= src.nextInt();

		int res1= a*b*c;
		int res2= (a+b)*c;
		int res3= a*(b+c);
		int res4= (a*b)+c;
		int res5= a+(b*c);
		int res6= a+b+c;
		
		int max=0;

		if(res1>max)
			max=res1;
		if(res2>max)
			max=res2;
		if(res3>max)
			max=res3;
		if(res4>max)
			max=res4;
		if(res5>max)
			max=res5;
		if(res6>max)
			max=res6;

		System.out.println(max);
		
	}		
}