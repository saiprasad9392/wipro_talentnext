package java_fundamentals;
import java.util.*;
public class Array_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		boolean allOneOrFour=true;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]!=4 && arr[i]!=1) {
				allOneOrFour=false;
				
			}
			
		}
		System.out.println(allOneOrFour);
		sc.close();

	}

}
