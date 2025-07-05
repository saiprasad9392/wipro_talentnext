package java_fundamentals;
import java.util.*;
public class Ascii_to_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ascii[]=new int[n];
		for(int i=0;i<n;i++) {
			ascii[i]=sc.nextInt();
		}
		for(int num:ascii) {
			System.out.print((char)num+" ");
		}
		System.out.println(" ");

	}

}
