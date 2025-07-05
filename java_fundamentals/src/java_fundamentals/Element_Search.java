package java_fundamentals;
import java.util.*;
public class Element_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int index=-1;
		for(int i=0;i<n;i++) {
		if(arr[i]==temp) {
			index=i;
			break;
		}
		}
			System.out.println(index);
			sc.close();
	}

}
