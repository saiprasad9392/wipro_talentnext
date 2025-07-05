package java_fundamentals;
import java.util.*;
public class case_alphabet {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final Scanner sc=new Scanner(System.in);
		char c1=sc.next().charAt(0);
		if(Character.isUpperCase(c1)) {
			c1=Character.toLowerCase(c1);
			System.out.println(c1);
		}
		else if(Character.isLowerCase(c1)) {
			c1=Character.toUpperCase(c1);
			System.out.println(c1);
		}

	}

}
