package java_fundamentals;
import java.util.*;
public class array_mim_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
			min=a[0];
			max=a[n-1];
			System.out.println(min);
			System.out.println(max);
			
		sc.close();

	}

}
