package java_fundamentals;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		if(n<=1) {
			System.out.println("Not a prime number");
			return;
		}
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Prime number");
		}
		else {
			System.out.println(" Not a Prime Number");
		}

	}

}
