import java.util.*;

public class even_odds{
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		long n= src.nextLong();
		long k= src.nextLong();

		if(k<=(n+1)/2){
			long i=k-1;
			System.out.println(2*i + 1);
		}else{
			long i= k-(n+1)/2;
			System.out.println(2*i);
		}
	}
}