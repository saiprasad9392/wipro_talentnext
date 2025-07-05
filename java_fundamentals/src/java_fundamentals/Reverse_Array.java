package java_fundamentals;
import java.util.*;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n * m];
        for (int i = 0; i < n * m; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print array as n rows and m columns
        for (int i = 0; i < n * m; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % m == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
