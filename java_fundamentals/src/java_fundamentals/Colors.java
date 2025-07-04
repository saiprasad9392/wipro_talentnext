package java_fundamentals;
import java.util.*;
public class Colors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c1=sc.next().charAt(0);
		if(c1=='y') {
			System.out.println(c1+"->"+"Yellow");
		}
		else if(c1=='r') {
			System.out.println(c1+"->"+"red");
		}
		else if(c1 == 'o') {
			System.out.println(c1+"->"+"Orange");
		}
		else {
			System.out.println("Enter correct input");
		}
	}

}
