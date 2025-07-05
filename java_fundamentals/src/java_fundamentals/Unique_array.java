package java_fundamentals;
import java.util.*;
public class Unique_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set <Integer> set=new TreeSet<>();
		for(int i=0;i<n;i++) {
			set.add(sc.nextInt());
		}
		for(int num:set) {
			System.out.println(num+" ");
		}
		sc.close();
	}
}
		