package java_fundamentals;
import java.util.*;
public class Sum_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int dup=Math.abs(n);
		while(dup>0) {
			int divide=dup%10;
			sum+=divide;
			dup/=10;
		}
		System.out.println(sum);

	}

}
