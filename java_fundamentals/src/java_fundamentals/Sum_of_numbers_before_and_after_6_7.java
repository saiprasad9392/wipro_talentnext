package java_fundamentals;
import java.util.*;
public class Sum_of_numbers_before_and_after_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extracted();

	}

	private static void extracted() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int index6=-1;
		int index7=-1;
		for(int i=0;i<n;i++) {
			if(a[i]==6 && index6==-1) {	
				index6=i;
			}
		if(a[i]==7 && index6!=-1 && i>index6) {
			index7=i;
			break;
		}
		}
		int sum=0;
		if(index6 !=-1 && index7 !=-1) {
		for(int i=0;i<index6;i++) {
			sum+=a[i];
		}
		for(int i=index7+1;i<n;i++) {
			sum+=a[i];
		}
		}
		else {
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}

}
