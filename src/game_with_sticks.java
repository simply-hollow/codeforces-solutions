import java.util.*;

public class game_with_sticks{

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		int n= src.nextInt();
		int m= src.nextInt();
		int count=0;
		boolean check=false;
		
		while(n>0 && m>0)
		{
			m--;
			n--;
			count=count+1;
			//System.out.println(count);
		}
		if(count%2==0)
			System.out.println("Malvika");
		else
			System.out.println("Akshat");
	}
}