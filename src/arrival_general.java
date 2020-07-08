import java.util.*;
public class arrival_general{

	static int n;

	static int searchMax(int []arr)
	{
		int max=0, pos=0;
		for(int i=0; i<n; i++){
			if(i>0 && max<arr[i]){
				max=arr[i];
				pos=i;
			}
			if(i==0){
				max=arr[i];
			}
		}
		for(int i=pos; i>0; i--)
		{
			int temp= arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
		}

		return pos;
	}

	static int searchMin(int []arr)
	{
		int min=0, pos=0;
		for(int i=0; i<n; i++){
			if(i>0 && min>=arr[i]){
				min=arr[i];
				pos=i;
			}
			if(i==0){
				min=arr[i];
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		n=src.nextInt();
		src.nextLine();
		int arr[]= new int[n];

		for(int i=0; i<n; i++)
			arr[i]=src.nextInt();

		int max= searchMax(arr);
		int min= searchMin(arr);
		int res= max + (n-min-1);

		System.out.print(res);
	}
}