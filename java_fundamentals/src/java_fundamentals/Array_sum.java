package java_fundamentals;
import java.util.*;
public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		
			float average=(float)sum/n;
			System.out.println(sum);
			System.out.println(average);
		sc.close();

	}

}
