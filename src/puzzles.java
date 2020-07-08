import java.util.*;

public class puzzles{

	static void sort(int []arr, int m){
		int key;
		for(int i=0; i<m-1; i++){
			key=arr[i];
			for(int j=i+1; j<m; j++)
				if(key<arr[j])
				{
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

					key=arr[i];
				}
		}
	}

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		int n=src.nextInt();
		int m= src.nextInt();
		src.nextLine(); //throws away the next line

		int []size= new int[m];
		for(int i=0; i<m; i++)
			size[i]=src.nextInt();

		sort(size, m);

		int max=999999;
		for(int i=0; m>i+n-1; i++){
			if((size[i]-size[i+n-1])<max)
				max=size[i]-size[i+n-1];
		}
		System.out.println(max);
	}
}