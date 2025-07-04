package java_fundamentals;
import java.util.*;

public class digit_special_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(Character.isLetter(ch)) {
			System.out.println("alphabet");
		}
		else if(Character.isDigit(ch)) {
			System.out.println("digit");
		}
		else {
			System.out.println("special character");
		}

	}

}
