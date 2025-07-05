package java_fundamentals;
import java.util.*;
public class Largest_two_smallest_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("The two smallest numbers are :");
		for(int i=0;i<2 && i<n;i++) {
			smallest=a[i];
		System.out.println(smallest);
		}
		System.out.println("The two largest numbers are :");
		for(int i=n-1;i>=n-2 &&n>=0;i--) {
			largest=a[i];
			System.out.println(largest);
		}
		sc.close();

	}

}
