import java.util.*;
public class dubstep{
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);

		String s= src.next();
		String str= s.replace("WUB", " ");
		//str=str.replace(" ", "");
		str= str.trim().replaceAll(" +", " ");
		System.out.println(str);
	}
}