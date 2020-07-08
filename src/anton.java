import java.util.*;

public class anton{
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		String st= "";
		String str=src.nextLine();
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='{' || str.charAt(i)=='}' || str.charAt(i)==',' || str.charAt(i)==' ')
				continue;
			st+=str.charAt(i);
		}
		//System.out.println(st);
		Set<Character> s= new HashSet<Character>();

		for(int i=0; i<st.length(); i++)
			s.add(st.charAt(i));

		System.out.println(s.size());
	}
}