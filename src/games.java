import java.util.*;

public class games{

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		int n= src.nextInt();
		src.nextLine(); //Throw away the next line
		int []home= new int[n];
		int []guest= new int[n];

		for(int i=0; i<n; i++)
		{
			home[i]=src.nextInt();
			guest[i]=src.nextInt();
			src.nextLine();
		}

//		for(int i=0; i<n; i++)
//			System.out.println(home[i]+ " "+guest[i]);
		int count=0;
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
			{
				if(i==j)
					continue;
				if(home[i]==guest[j])
					count++;
			}

		System.out.println(count);	
	}
}