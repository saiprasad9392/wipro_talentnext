package java_fundamentals;
import java.util.*;
public class Array_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int num :a) {
			if(num%2 ==0) {
				System.out.print(num+" ");
		}
		}
		for(int odd:a) {
			if(odd%2!=0) {
				System.out.print(odd+" ");
			}
		}
			System.out.println(" ");
		sc.close();

	}

}
