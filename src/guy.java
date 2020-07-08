import java.util.*;

public class guy{
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		int n= src.nextInt();

		src.nextLine(); //throws next line

		int x= src.nextInt();
		int []levelx= new int[x];
		for(int i=0; i<x; i++)
			levelx[i]=src.nextInt();

		src.nextLine();

		int y= src.nextInt();
		int []levely= new int[y];
		for(int i=0; i<y; i++)
			levely[i]=src.nextInt();

		Set<Integer> lev= new HashSet<Integer>();

		for(int i=0; i<x; i++)
			lev.add(levelx[i]);
		for(int i=x; i<x+y; i++)
			lev.add(levely[i-x]);

		if(lev.size()==n)
			System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
	}
}