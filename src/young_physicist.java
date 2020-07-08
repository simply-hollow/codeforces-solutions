import java.util.*;

public class young_physicist{

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		int n= src.nextInt();
		src.nextLine(); //Throw away the next line
		int []x= new int[n];
		int []y= new int[n];
		int []z= new int[n];

		for(int i=0; i<n; i++)
		{
			x[i]=src.nextInt();
			y[i]=src.nextInt();
			z[i]=src.nextInt();
			src.nextLine();
		}
		int resx=0, resy=0, resz=0;
		for(int i=0; i<n; i++){
			resx=resx+x[i];
			resy=resy+y[i];
			resz=resz+z[i];
		}
		if(resx==0 && resy==0 && resz==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
