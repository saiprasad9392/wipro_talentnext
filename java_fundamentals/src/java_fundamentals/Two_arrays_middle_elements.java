package java_fundamentals;

import java.util.*;

public class Two_arrays_middle_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		int middle = n / 2;
		System.out.println(a[middle]);
		System.out.println(b[middle]);
		sc.close();

	}

}