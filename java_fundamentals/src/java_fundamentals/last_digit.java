package java_fundamentals;
import java.util.*;
public class last_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=a%10;
		int e=b%10;
		if(d == e) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

}
