package java_fundamentals;
import java.util.*;
public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int temp=Math.abs(n);
		while(temp>0) {
			int digit=temp%10;
			count=count*10+digit;
			temp/=10;
		}
		if(n<0) {
			count=-count;
		}
		System.out.println(count+" ");
		sc.close();

	}

}
