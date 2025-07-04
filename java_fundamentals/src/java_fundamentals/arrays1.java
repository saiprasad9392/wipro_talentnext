package java_fundamentals;
import java.util.*;
public class arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("No values");
			sc.close();
			return;
		}
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");

		}
	}

}
